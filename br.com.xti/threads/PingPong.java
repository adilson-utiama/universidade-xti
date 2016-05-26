package threads;

public class PingPong extends Thread{

	String palavra;
	long tempo;
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public void run(){


		try {
			for(int i=0;i<5;i++){
				System.out.print(palavra);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;

		}

	}

	public static void main(String[] args) {

		//1 Thread = execulta um passo por vez
		//Multi Thread  = executa varios passos de uma veg tempo

		new PingPong("ping", 1600).start();;
		new PingPong("PONG", 1900).start();;
		System.out.println("Ver Thread");
	}
}
