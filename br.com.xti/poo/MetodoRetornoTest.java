package poo;

public class MetodoRetornoTest {

	public static void main(String[] args) {
		MetodoRetorno m = new MetodoRetorno();
		/*
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		double so = m.soma(10, 20);
		System.out.println(so);
		*/
		
		/*
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double so = m.soma(par, impar);
		*/
		
		//ou tambem desta forma
		double so = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(so);
		
		//Argumentos  Variaveis
		
		double total = m.somaArg(2,3,5,6,7);
		
		System.out.println("Total = " + total);
		
	}

}
