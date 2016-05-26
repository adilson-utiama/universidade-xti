package erros;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		
		/*ASSERIONS devem se usadas apenas para testar erros que nao
		*deveriam acontecer, em tempo de desenvolvimento do programa
		*Por padrao elas estao desativadas, pois nao devem ser parte do 
		*roteiro do programa, servindo apenas para auxiliar o desenvolvedor 
		*Para ativar as assertions
		*acesse run configurations na aba RUN
		*na aba ARGUMENTS , VM ARGUMENTS
		*digite -ea (enable assertions)
		*/ 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre um numero de 0 a 10");
		int numero = s.nextInt();
		
		assert(numero >= 0 && numero <=10): "Numero Invalido" + numero;
		System.out.println("Voce entrou " + numero);
		s.close();
	}

}
