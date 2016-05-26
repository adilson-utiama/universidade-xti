package threads;


//pode-se criar threads tanto com a classe Thread quanto 
//implementando a classe Runnable

public class PingPongRunnable implements Runnable{

	String palavra;
	long tempo;
	
	//Construtor
	public PingPongRunnable(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public static void main(String[] args) {

		Runnable ping = new PingPongRunnable("ping", 1600);
		Runnable pong = new PingPongRunnable("PONG", 1900);
		
		//criacao de uma thread usando um objeto Runnable
		//e uma String como nome ou outra coisa
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
		System.out.println("Ver Thread");
	}

	//metodo de runnable implementado
	@Override
	public void run() {
		try {
			for(int i=0;i<100;i++){
				System.out.print(palavra + " ");
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;

		}

	}
}
