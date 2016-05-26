package polimorfismo;

//CLASSES E METODOS ABSTRATOS
//NAO PODEM SER INSTANCIADAS
//possuem "abstract" nos metodos de acesso


public abstract class AnimalAbstrato {
	
	double peso;
	String comida;
	
	//classes abstratas podem ter metodos implementados
	void dormir(){
		System.out.println("Dormiu");
	}
	
	//metodo abstrato (metodos por implementar)
	//obrigando as sub-classes a sobreescrever esses metodos
	//nao podem ter corpo, e so podem existir em classes abstratas
	abstract void fazerBarulho();
	
}
