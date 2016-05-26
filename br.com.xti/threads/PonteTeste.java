package threads;

public class PonteTeste {

	
	/**
	 * Testa as classes Produtor, Consumidor, Interface Ponte, e
	 * PonteSincronizada e PonteNaoSincronizada
	 * --PonteNaoSincronizada demonstra um erro de sincronizacao corrigida na classe
	 * PonteSincronizada com metodo wait() e notifyAll() com uma
	 * avalizacao de tipo boolean para controle
	 * 
	 *  Produtor so produzira enquanto este estiver vazio
	 *  Consumidor so consumira se este estiver cheio
	 *  
	 *  resultado final deve bater de igual para igual para eles
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Ponte ponte = new PonteNaoSincronizada();
		
		Ponte ponte = new PonteSincronizada();
		
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
	}
}
