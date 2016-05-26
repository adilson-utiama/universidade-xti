package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTraceEThrows {
	//metodo dividir
	public static void dividir(Scanner s) 
	//throws usado em metodos
		throws InputMismatchException, ArithmeticException
	{
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		
		
		/*TRATAMENTO COM EXCEPTION*/
		/* Multi Catch
		 * stackTrace
		 * throws
		 * excecoes comuns
		 * */
		 
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do{
			try{
				//metodo dividir
				dividir(s);
				continua = false;
				//uso do multi-catch, a partir da versao 7 do java
			}catch(InputMismatchException | ArithmeticException e1){
				System.err.println("Numeros Invalido");
				//printStackTrace imprime toda a pilha de erro encontrada 
				//e1.printStackTrace();
				//e1.getStackTrace();//recebe um array de stacktrace dos erros identificados
				e1.getMessage();//imprime no formato string
				s.nextLine();//descarta a entrada errada e libera novamente para usuario
			}finally{
				System.out.println("Finally executado...");
				
			}
		}while(continua);	
		s.close();
	}

}	
		
			
		
			
	
