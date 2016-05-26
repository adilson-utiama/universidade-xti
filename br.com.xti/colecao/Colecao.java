package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		//retorna as strings da colecao(array)
		System.out.println(c.toString());
		//verifica se esta vazio
		System.out.println(c.isEmpty());
		//verifica se contem a string informada
		System.out.println(c.contains("A"));
		//remove elemento
		c.remove("A");
		System.out.println(c.toString());
		
		
		/* Grupos */
		//transorma um array em uma colecao
		Collection<String> c2 = Arrays.asList("O","U");
		//metodo addall recebe outra colecao
		c.addAll(c2);
		System.out.println(c.toString());
		//verifica se existe todos esses elementos da colecao 2 em colecao 1
		c.containsAll(c2);
		//remove todos os elemntos de outra colecao
		c.removeAll(c2);
		
		/* Percorrer os elementos da string*/
		//com foreach
		for (String string : c) {
			System.out.println(string);
		}
		//converte uma colecao em um array
		//retorna um array de strings
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		//remove todos os elementos do array ou colecao
		c.clear();
		
	}
}
