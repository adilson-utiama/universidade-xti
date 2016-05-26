package poo;

import java.util.Random;
import java.util.Scanner;

public class Programas {

	public static void main(String[] args) {
		String rep = new String();
		//System.out.println("Tecle Enter para Continuar....");
		while (rep != "continua"){
			
			
			System.out.println("PROGRAMAS DO ADILSON");
			System.out.println("1 - Programa 1");
			System.out.println("2 - Programa 2");
			System.out.println("3 - Programa 3");
			System.out.println("4 - Programa 4");
			System.out.println("Escolha uma Opcao: ");
			Scanner s = new Scanner(System.in);
			String opcao = s.nextLine();
			
			switch (opcao){
			case "1":
				String[] atributosUm = {"Gordo","Porco","GAY","Bichona","Atrapalhado"};
				String[] atributosDois = {"Legal","Folgado","Afeminado","Feio","Traveco"};
				String[] atributosTres = {"Corno","Vagabundo","Burro","Gente Boa","Viadao"};
				Random r = new Random();
				int atribUm = r.nextInt(atributosUm.length);
				String aUm = atributosUm[atribUm];
				int atribDois = r.nextInt(atributosDois.length);
				String aDois = atributosDois[atribDois];
				int atribTres = r.nextInt(atributosTres.length);
				String aTres = atributosTres[atribTres];
				
				System.out.println("Escolha um nome masculino:");
				String nome = s.nextLine();
				String item1;
				String item2;
				String item3;
				String item4;
				System.out.println("O " + nome + " e " + aUm + " ? s/n ");
				String op = s.nextLine();
				switch(op){
				case "s":
					item1 = aUm;
					System.out.println("Entao o " + nome + " tambem e " + aDois + " e " + aTres + "!!!");
					item2 = aDois;
					item3 = aTres;
					break;
				case "n":
					System.out.println("Entao o " + nome + " e " + aDois + " ? s/n");
					String op2 = s.nextLine();
					switch(op2){
					case "s":
						item1 = aUm;
						System.out.println("Entao o " + nome + " tambem e " + aDois + " e " + aTres + "!!!");
						item2 = aDois;
						item3 = aTres;
						break;
					case "n":
						System.out.println("Entao o " + nome + " e " + aTres + " ? s/n");
						String op3 = s.nextLine();
						switch(op3){
						case "s":
							item1 = aUm;
							System.out.println("Entao o " + nome + " tambem e " + aUm + " e " + aTres + "!!!");
							item2 = aDois;
							item3 = aTres;
							break;
						case "n":
							System.out.println("Entao o " + nome + " e " + aUm + " ? s/n");
							String op4 = s.nextLine();
							switch(op4){
							case "s":
								item1 = aUm;
								System.out.println("Entao o " + nome + " tambem e " + aDois + " e " + aUm + "!!!");
								item2 = aDois;
								item3 = aTres;
								break;
							case "n":
								System.out.println("Entao o " + nome + "nao e PORRA NENHUMA!!!!!!!");
							break;
							default:
								System.out.println("opcao Invalida4!!!");
								break;
					        }
						    default:
							System.out.println("opcao Invalida3!!!");
							break;
							
					      }
					    default:
						System.out.println("opcao Invalida2!!!");
						break;
						
					    }
				    default:
					System.out.println("opcao Invalidallll!!!");
					break;
				   
				     }
				//default:
				//System.out.println("opcao Invalidallll!!!");
				//break;
			
			case "2":
				System.out.println("programa2");
				break;
			case "3":
				System.out.println("programa3");
				break;
			case "4":
				System.out.println("programa4");
				break;
			default:
				System.out.println("opcao Invalida!!!");
				break;
				
			}
			
		}

	}

}	
			
			
			
		
