package polimorfismo;

public class GalinhaConcreta extends AnimalAbstrato{

	//classes concretas(nao abstratas)
		//sao obrigadas a implementar metodos de sua classe pai
	
	//sobreescrita de metodo da classe abstrata
	@Override
	void fazerBarulho() {
		System.out.println("Co, Co !");
		
	}
	
	
}
