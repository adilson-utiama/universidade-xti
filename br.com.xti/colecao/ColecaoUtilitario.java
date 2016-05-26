package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guarana");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Acai");
		list.add("Banana");
		System.out.println(list);
		
		//A Classe Collections pode manipular todos os tipos de colecoes
		
		//Ordena em ordem alfabetica
		Collections.sort(list);
		System.out.println(list);
		//Inverte a ordem
		Collections.reverse(list);
		System.out.println(list);
		//mistura de forma aleatoria
		Collections.shuffle(list);
		System.out.println(list);
		//adiciona elementos a colecao
		Collections.addAll(list, "Cupuacu", "Laranja", "Laranja");
		System.out.println(list);
		
		//retorna a quantidade de vezes que o elemento repete na lista
		System.out.println(Collections.frequency(list, "Laranja"));
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		//verifica na lista principal se tem os elementos da lista secundaria
		boolean d = Collections.disjoint(list, list2);
		
		Collections.sort(list);
		//retorna o indice do elemnto guarana
		int indice = Collections.binarySearch(list, "Guarana");
		System.out.println(indice);
		//preenche todas as posicoes da colecao com a string acai
		Collections.fill(list, "Acai");
		System.out.println(list);
		
		//colecao nao modificavel
		Collection<String> constante = 
				Collections.unmodifiableCollection(list);
	}
}
