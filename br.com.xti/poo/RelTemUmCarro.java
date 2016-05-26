package poo;

public class RelTemUmCarro {

	

		String modelo;
		int velocidadeMaxima;
		double segundosZeroACem;
		public RelTemUmMotor motor; //cria um relacionamento TEM-UM com RelTemUmMotor
		
		
		//construtor padrao, normalmente oculto
		public RelTemUmCarro(){
			
		}
		
		
		//construtor sendo inicializados diretamente dentro do construtor
		public RelTemUmCarro(String modelo, int velocidadeMaxima, double segundosZeroACem){
			this.modelo = modelo;
			this.velocidadeMaxima = velocidadeMaxima;
			this.segundosZeroACem = segundosZeroACem;
		}
		
		
	
}
