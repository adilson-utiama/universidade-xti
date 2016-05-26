package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {

		//int x = 1 / 0;
		//esta operacao vai resultar em uma exception
		//ArithmeticException
		/*
		Scanner s = new Scanner(System.in);
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();
		System.out.println(a / b);
		*/
		//Se por acaso o usuario digitar uma palavra ou letra
		//ela vai gerar uma "InputMismatchException"
		//e encerrara o programa
		
		/*TRATAMENTO COM EXCEPTION*/
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do{
			try{
				System.out.print("Numero: ");
				int a = s.nextInt();
				System.out.print("Divisor: ");
				int b = s.nextInt();
				System.out.println(a / b);
				continua = false;
			}catch(InputMismatchException e1){
				System.err.println("Numeros devem ser inteiros");
				s.nextLine();//descarta a entrada errada e libera novamente para usuario
			}catch(ArithmeticException e2){
				System.err.println("Divisor deve ser diferente de 0");
			}finally{
				System.out.println("Finally executado...");
				
			}
		}while(continua);	
		s.close();
	}

}	
		
			
		
			
	
