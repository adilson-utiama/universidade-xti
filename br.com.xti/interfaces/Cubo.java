package interfaces;

//exemplo de heranca multipla
//Pode-se usar varias interfaces, separando as por virgula
public class Cubo implements VolumeCalculavel, AreaCalculavel{

	double lado;
	
	//construtor da classe cubo
	public Cubo(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularVolume() {
		return 6 * lado * lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado * lado;
	}

}
