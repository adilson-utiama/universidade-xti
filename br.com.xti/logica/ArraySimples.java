package logica;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String []args) {
		
		//Array Simples
		String[] paises = {"Brasil","Russia","India","China"};
		System.out.println(Arrays.toString(paises));
		
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		/* Para alterar um valor de array
			paises [0] = "Brazil";
		*/
		
		
		//Array Multidimensional
		String [][] duas = {
			{"Ricardo","M","DF"},
			{"Sandra","F","MG"},
			{"Adilson","M","SP"}
		};
		
		System.out.println(duas[0][0]);
		System.out.println(duas[1][2]);
		System.out.println(duas.length);
		System.out.println(Arrays.toString(duas[0]));
		System.out.println(Arrays.toString(duas[2]));
		
		/* Para alterar um valor de array multidimensional
			duas [0][0] = "RICARDO";
		*/
		
	
	}
}