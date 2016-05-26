package interfaces;


//para usar uma interface, adicione "implements" mais a interface
public class Quadrado implements AreaCalculavel{

	double lado;
	
	//construtor da classe Quadrado
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
