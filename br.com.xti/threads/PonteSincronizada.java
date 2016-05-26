package threads;

public class PonteSincronizada implements Ponte{

	//sincroniza threads para que cada vez que produtor
	//produzir logo em seguida seja consumida pelo consumidor
	
	private int valor = -1;
	private boolean ocupada = false;
	
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		
		while(ocupada){
			System.out.println("Ponte Cheia. Produtor Aguardar...");
			wait();//metodo faz thread que esta executando aguardar
			//enquanto ela estiver cheia
		}
		
		System.out.print("Produziu " + valor);
		this.valor = valor;
		
		ocupada = true;
		notifyAll();//notifica as threads que aguardam, prosseguirem sua execucao
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupada){
			System.out.println("Ponte Vazia. Consumidor Aguarda...");
			wait();//espera ate que ponte esteja cheia novamente
		}
		
		System.err.print("Consumiu " + valor);
		ocupada = false;
		notifyAll();//notifica a thread a prosseguir
		
		return valor;
	}

}
