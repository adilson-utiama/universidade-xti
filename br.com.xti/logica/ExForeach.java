package logica;
import java.util.ArrayList;

public class ExForeach{

	public static void main(String []args){
		
		//for aprimorado, muito utilizado para percorrer arrays e arraylists
		int[] pares = {2,4,6,8};
		for( int i = 0; i < pares.length; i++ ) {
			int par = pares[i];
			System.out.print(par + ",");
		}
		
		System.out.println();
		//pose ser feito desta forma
		for(Integer par : pares){
			System.out.print(par + ",");
		}
		
		
		System.out.println();
		//outro exemplo
		ArrayList<Integer> list = new ArrayList<Integer>();
		for( int i = 0; i < 10; i++ ) {
			list.add(i);
		}
		//imprimir lista
		for(Integer numero : list) {
			System.out.print(numero + ",");
		}
		
		
	}

}