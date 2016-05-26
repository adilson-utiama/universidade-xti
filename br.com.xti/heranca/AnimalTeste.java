package heranca;

//HERANCA 
//Relacionamento E-UM
//exemplo Cachorro E-UM Animal
//
//POLIMORFISMO
//Modifica comportamento natural da heranca
//Sobrescrita de metodos da superclasse

public class AnimalTeste {
	
	//polimorfismo
	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		Cachorro toto = new Cachorro();//cachorro herda atributos e metodos de Animal
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		//
		Animal generico = new Animal(0,null);
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		//operador instanceof avalia se um objeto e de um tipo especifico

		toto.equals(carijo);//compara dois objetos
		toto.hashCode();//gera um serial do objeto
		toto.getClass();//retorna o tipo da classe do objeto
		toto.toString();//retorna a representacAO DE UM OBJETO
		
		//polimorfismo
		//chamada de metodos
		generico.fazerBarulho();//generico chama metodo da Superclasse Animal
		toto.fazerBarulho();//toto chama metodo da classe cahorro
		carijo.fazerBarulho();//carijo chama metodo da classe galinha
		
		barulho(toto);//metodo barulho chama metodo do objeto da classe cachorro
		barulho(carijo);
	}

}
