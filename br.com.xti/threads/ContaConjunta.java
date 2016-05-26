package threads;

public class ContaConjunta {
	
	//Sincronizacao de Threads
	//com modificador de metodo
	//synchronized
	
	//uso: bloqueia uma thread enquanto outra estiver sendo execultada,
	//assim que a thread anterior finaliza a funcao, ele libera a proxima 
	//thread para executar
	

	private int saldo = 100;
	
	public int getSaldo(){
		return saldo;
	}
	
	
	//Com o uso do modificador synchronized
	//ele nao deixa que uma thread seja executada antes da thread
	//anterior finalizar sua atividade, evitando assim que vire uma
	//bagunça total de threads
	public synchronized void sacar(int valor, String cliente){
		if(saldo >= valor){
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);//aguardando processamento
			} catch (InterruptedException e) {
			
			} 
			saldo -= valor;
			String msg = cliente + " SACOU " + valor
					+ " [Saldo Original=" + saldoOriginal
					+ ", Saldo Final=" + saldo + "]";
			System.out.println(msg);
			
		}else{
			System.out.println("Saldo Insulficiente para " + cliente);
		}
		
	}
}
