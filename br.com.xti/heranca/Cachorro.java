package heranca;
//extends indica que herda metodos e propriedades da classe Animal
//ou classe Pai
public class Cachorro extends Animal {
	
	double peso;
	
	//chamada do construtor definido da Superclasse Animal
	public Cachorro(){
		//this.peso = peso; //this faz referencia ao atributo peso da classe cachorro
		super(30,"Carne"); //super faz refencia a atributo da superclasse Animal
		super.serial = serial;
	}
	//polimorfismo
	//sobrescreve o metodo da superclasse Animal
	void fazerBarulho(){
		System.out.println("Au , Au!");
	}
}
