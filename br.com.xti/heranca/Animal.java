package heranca;
//A classe Animal seria a Super Classe

public class Animal {
	
	protected int serial;
	double peso;
	String comida;
	
	//construtor padrao
	public Animal(){}
	
	//construtor da super classe Animal definido
	public Animal(double peso,String comida){
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir(){
		System.out.println("Dormiu");
	}
	void fazerBarulho(){
		System.out.println("Fazer Barulho");
	}
}
