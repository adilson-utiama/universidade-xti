package logica;
import java.util.Scanner;

public class ExIfElse{

	public static void main(String []args){
	
			
			//Para avalair se um numero e par ou impar
			System.out.println("/////////////////////////////////////");
			System.out.println("PAR OU IMPAR?");
			System.out.println("/////////////////////////////////////");
			//
			Scanner s = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			String num = s.nextLine();
			//Converte uma String em um valor inteiro
			int numero = Integer.parseInt(num);
			
			if((numero % 2) == 0) {
				System.out.println("O numero e Par");
			} else {
				System.out.println("O numero e Impar");
			}
			
			System.out.println("/////////////////////////////////////");
			System.out.println("/////////////////////////////////////");
			
			//Para verificar a idade
			System.out.println("VERIFICADOR DE IDADE");
			System.out.println("/////////////////////////////////////");
			//
			Scanner i = new Scanner(System.in);
			System.out.println("Digite a sua Idade: ");
			String string = i.nextLine();
			//Converte uma String em um valor inteiro
			int idade = Integer.parseInt(string);
			
			if(idade <= 12) {
				System.out.println("Voce e um Criancao");
			} else if (idade > 12 && idade <= 18) {
				System.out.println("Voce e um Adolescente Problematico");
			} else if (idade > 18 && idade <= 60) {
				System.out.println("Voce e um Adulto Acabado");
			} else {
				System.out.println("Voce e um Velho Tarado");
			}
			
			
			System.out.println("/////////////////////////////////////");
			System.out.println("/////////////////////////////////////");
			
			
			//Calcular Media de notas
			System.out.println("CALCULAR MEDIA E VER SE PASSOU");
			System.out.println("/////////////////////////////////////");
			//
			Scanner s1 = new Scanner(System.in);
			System.out.println("Digite a Primeira nota: ");
			String string1 = s1.nextLine();
			double nota1 = Double.parseDouble(string1);
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Digite a Segunda nota: ");
			String string2 = s2.nextLine();
			double nota2 = Double.parseDouble(string2);
			
			Scanner s3 = new Scanner(System.in);
			System.out.println("Digite a Terceira nota: ");
			String string3 = s3.nextLine();
			double nota3 = Double.parseDouble(string3);
			
			double nota = (nota1 + nota2 + nota3) / 3;
			System.out.println("Media: " + nota);
			
			if (nota >= 7) {
				System.out.println("Voce foi Aprovado!!!!Parabens!!!!");
			} else {
				System.out.println("Voce foi Reprovado!! Seu Inutil!!");
				if (nota >= 6){
					System.out.println("Mas ainda pode fazer a Recuperacao!!!");
				} 
			}	    
				
			
			
	}

}