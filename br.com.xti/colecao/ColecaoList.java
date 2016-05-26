package colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		//Interface List trabalha com dados ordenados e 
		//pode receber registros duplicados
		
		List<String> list = new ArrayList<>();
		list.add("Futebol");
		list.add("Basquete");
		list.add("Tenis");
		list.add("Volei");
		list.add("Natacao");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++){
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());//coloca todos os elementos em letra maiscula
		}
		System.out.println(list);
		//retorna a posicao do elemento boxe
		System.out.println(list.indexOf("BOXE"));
		//retorna os elementos dentro das posicoes informadas
		System.out.println(list.subList(2, 4));
		//remove os elementos dentro das posicoes informadas
		list.subList(2, 4).clear();
		
		
	}
}
