package erros;

import heranca.Animal;
import heranca.Cachorro;
import heranca.Galinha;


public class ExcecoesComuns {

	//static int[] arrayNull;	//metodo de objeto nulo
	static int[] arrayNull = new int[0];
	
	public static void main(String[] args) {
		
		//NullPointerException
		//acessando um metodo de um obj que nao existe
		//System.out.println(arrayNull.length);
		
		//ArithmeticException
		//int x = 5 / 0;
		
		//ArrayIndexOutOfBoundsException
		//acessando uma posicao de um array inexistente
		//System.out.println(arrayNull[1]);
		
		//ClassCastException
		//Animal a = new Galinha();
		//Cachorro c = (Cachorro) a;
		//nao passa do teste E-UM
		//nao existe um relacionamento entre galinha e cachorro
		
		//NumberFormatException
		//impossivel conversao
		//int inteiro = Integer.parseInt("x");
		
	}

}
