package poo;

public class GalinhaTeste {
	//Atributos e metodos estaticos
	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();
		g1.botar().botar().botar();
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
		
		System.out.println(g1.ovos);//total de ovos da galinha 1
		System.out.println(g2.ovos);//total de ovos da galinha 2
		System.out.println(Galinha.ovosDaGranja);//total de ovos de todas as galinhas
		System.out.println(Galinha.mediaDeOvos(2));
	}

}
