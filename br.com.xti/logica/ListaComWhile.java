package logica;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaComWhile{

	public static void main(String []args){
	
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus Produtos : Para sair digite FIM");
		
		String produto;
		//!"FIM" negacao, se nao for igual a FIM faca
		//.equals = compara tipos String
		//s.nextLine() = le o valor digitado pelo usuario
		while(!"FIM".equals(produto = s.nextLine())) {
			//adiciona em produtos (arraylist)
			produtos.add(produto);
		}
		//toString = percorre todo o arraylist
		System.out.println(produtos.toString());
	}

}