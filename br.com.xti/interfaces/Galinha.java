package interfaces;

import heranca.Animal;

//exemplo de tipos dispares ( diferentes )
//Galinha impementando metodos da Interface AreaCalculavel e VolumeCalculavel
public class Galinha extends Animal implements AreaCalculavel, VolumeCalculavel{

	void fazerBarulho() {
		System.out.println("Co, Co !");
		
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
