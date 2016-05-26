package poo;

public class ConstrutoresTest {

	public static void main(String[] args) {
		
		//construtor da forma tradicional
		Construtores ferrari = new Construtores();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		//construtores tem o mesmo nome da classe
		
		//modelo de construtores definidos
		Construtores koenigsegg = new Construtores("Koenigsegg CCRX",430,3.1);
			
		
		System.out.println(koenigsegg.modelo);
		System.out.println(koenigsegg.segundosZeroACem);
		System.out.println(koenigsegg.velocidadeMaxima);
	}

}
