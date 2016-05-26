package polimorfismo;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
	
		AnimalAbstrato cachorro = new CachorroConcreta();
		AnimalAbstrato galinha = new GalinhaConcreta();
		
		cachorro.fazerBarulho();
		galinha.fazerBarulho();
	}
}
