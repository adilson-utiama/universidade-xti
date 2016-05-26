package poo;

public class RelTemUmCarroTeste {

	public static void main(String[] args) {
		//construtor da forma tradicional
		        RelTemUmCarro ferrari = new RelTemUmCarro();
				ferrari.modelo = "Ferrari Enzo";
				ferrari.velocidadeMaxima = 349;
				ferrari.segundosZeroACem = 3.2;
				
				//construtores tem o mesmo nome da classe
				
				//modelo de construtores definidos
				RelTemUmCarro koenigsegg = new RelTemUmCarro("Koenigsegg CCRX",430,3.1);
				RelTemUmMotor v8 = new RelTemUmMotor("V8",1018);
				koenigsegg.motor = v8;
				
				
				System.out.println(koenigsegg.modelo);
				System.out.println(koenigsegg.segundosZeroACem);
				System.out.println(koenigsegg.velocidadeMaxima);
				System.out.println(koenigsegg.motor.potencia);
			
				//exemplo de relacionamento TEM-UM
				
				RelTemUmMotor v12 = new RelTemUmMotor();
				v12.tipo = "V12";
				v12.potencia = 660;
				
				ferrari.motor = v12;//adiciona um motor a ferrari
					
	}
	
	
	
	
    
}
