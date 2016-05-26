package colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		//Colecao Set NAO aceita elementos duplicados
		
		String[] cores = {"verde", "amarelo", "azul", "branco", 
				"azul", "amarelo", "verde"};
		List<String> list = Arrays.asList(cores);
		//uma lista com elementos duplicados
		System.out.println(list);
		
		
		//nesta colecao ele rejeita os elementos duplicados
		Set<String> set = new HashSet(list);
		System.out.println(set);
		
	}
	
}
