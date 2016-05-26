package poo;

public class Construtores {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	
	//construtor padrao, normalmente oculto
	public Construtores(){
		
	}
	
	
	//construtor sendo inicializados diretamente dentro do construtor
	public Construtores(String modelo, int velocidadeMaxima, double segundosZeroACem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
}
