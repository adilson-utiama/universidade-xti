package logica;
public class ExWhile{

	public static void main(String[] args){
	
		//uso do while apenas
		//executa fluxo de repeticao de 0 ate n vezes
		int i = 0;
		while ( i < 6 ) {
			System.out.print(i + ",");
			i++;
		}
	
	System.out.println();
	
		//uso do do/while
		//executa fluxo de repeticao primeiro 1 vez ate n vezes
		int in = 2;
		do{
			System.out.print(in + ",");
		    in++;
		} while ( in < 7 );
		
		//CUIDADO COM OS LOOPS INFINITOS
	
	}

}