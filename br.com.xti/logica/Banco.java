package logica;
import java.util.Scanner;

public class Banco {

	public static void main(String []args){
	
		//Movimentacao de Banco
		/*
		System.out.println("senha:");
		Scanner s10 = new Scanner(System.in);
		String pass = s10.nextLine();
		int senha = Integer.parseInt(pass);
		
		} else {}
		*/
		
		System.out.println("Digite a Senha de Acesso:");
		Scanner ss = new Scanner(System.in);
		String pass = ss.nextLine();
		int senha = Integer.parseInt(pass);
		
		if (senha == 1234){
			System.out.println("Prosseguindo.....");
		
		
		int saldo = 1000;
		int deposito;
		int saque;
		
		for (int loop = 0; loop < 7; loop++) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("/////////////////////////////////");
			System.out.println("BEM VINDO AO BANCO DO ADILSAO");
			System.out.println("/////////////////////////////////");
			System.out.println(" ");
			System.out.println("1 - Ver Saldo.");
			System.out.println("2 - Depositar Valor.");
			System.out.println("3 - Sacar Dinheiro.");
			System.out.println("4 - Sair.");
			System.out.println(" ");
			System.out.println("/////////////////////////////////");
			System.out.println(" ");
			System.out.print("Digite sua Opcao:");
			System.out.println(" ");
			
		
			Scanner s = new Scanner(System.in);
			String num = s.nextLine();
			int opcao = Integer.parseInt(num);
				switch (opcao) {
					case 1:
						System.out.println(" ");
						System.out.println("----------------------------------------");
						System.out.println("Seu Saldo e de " + saldo + " reais");
						System.out.println("----------------------------------------");
						System.out.println(" ");
						break;
					case 2:
						System.out.println(" ");
						System.out.println("----------------------------------------");
						System.out.print("Digite a Quantia a Depositar:");
						System.out.println(" ");
						System.out.println(" ");
						Scanner s1 = new Scanner(System.in);
						String num1 = s1.nextLine();
						int dinheiro = Integer.parseInt(num1);
						deposito = (saldo + dinheiro);
						System.out.println(" ");
						System.out.println("----------------------------------------");
						System.out.println("Seu Saldo atual e de: " + deposito + " reais");
						System.out.println("----------------------------------------");
						System.out.println(" ");
						saldo = deposito;
						break;
					case 3:
						System.out.println(" ");
						System.out.println("----------------------------------------");
						System.out.println("Saldo: " + saldo + " reais");
						System.out.println(" ");
						System.out.println("----------------------------------------");
						System.out.println(" ");
						System.out.print("Digite a Quantia a sacar:");
						System.out.println(" ");
						Scanner s2 = new Scanner(System.in);
						String num2 = s2.nextLine();
						int sacar = Integer.parseInt(num2);
						saque = (saldo - sacar);
							if (saque < 1){
								System.out.println("----------------------------------------");
								System.out.println(" ");
								System.out.println("SALDO INSUFICIENTE!!!!!");
								System.out.println(" ");
								System.out.println("----------------------------------------");
							} else {
								System.out.println(" ");
								System.out.println("----------------------------------------");
								System.out.println("Seu Saldo atual e de: " + saque + " reais");
								System.out.println("----------------------------------------");
								System.out.println(" ");
								saldo = saque;
							}
						
						break;	
					case 4:
					    break;
					default:
						System.out.println("----------------------------------------");
						System.out.println("Opcao Invalida");	
						System.out.println("----------------------------------------");
						break;
					
				}
			if (loop == 6){
				System.out.println("----------------------------------------");
				System.out.println("Operacoes Bancarias excedidas!! Fim da Operacao.");
				System.out.println("Volte Sempre!!");
				System.out.println("----------------------------------------");
			} else if (opcao == 4){
				loop = 6;
				System.out.println("----------------------------------------");
				System.out.println("Volte Sempre!!");
				System.out.println("----------------------------------------");
			}
						
		}				
		
		} else {
			System.out.println("SENHA INCORRETA!!!");
		}			
	}			
					
}					
				
			
		
			
		
		
	

	
		
		
		
		
		
		 
	
