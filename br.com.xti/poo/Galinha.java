package poo;

public class Galinha {
	
	public static int ovosDaGranja; //variavel global, pertence a classe nao ao metodo
	
	public int ovos; //total de ovos do objeto galinha
	
	public Galinha botar(){
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	//this representa uma instancia de um objeto
	public static double mediaDeOvos(int galinhas){
		return ovosDaGranja / galinhas;
	}
}
