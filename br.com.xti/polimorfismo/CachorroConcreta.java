package polimorfismo;

public class CachorroConcreta extends AnimalAbstrato {

	//classes concretas(nao abstratas)
	//sao obrigadas a implementar metodos de sua classe pai
	
	//sobreescrita do metodo da classe abstrata
	@Override
	void fazerBarulho() {
		System.out.println("Au, Au !");
	}
	
	
}
