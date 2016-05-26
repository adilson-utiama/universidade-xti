package polimorfismo;

public abstract class CachorroAbstrato extends AnimalAbstrato {

	//classes abstratas
	//NAO sao obrigadas a implementar metodos de sua classe pai
	
	//sobreescrita do metodo da classe abstrata
	@Override
	void fazerBarulho() {
		System.out.println("Au, Au !");
	}
	
	
}
