package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		//Colecao Map, associa chaves a valores
		//as chaves devem ser unicas mas os valores podem ser duplicados
		//excemplo: armazenar dados de uma pessoa fisica
		
		//diferente de outras colecoes, precisa especificar dois tipos
		//a primeira a chave, a segunda ao valor
		Map<String, String> pais = new HashMap<>();
		//dois parametros
		//primeira-chave, segunda-valor
		pais.put("BR", "Brasil");
		pais.put("RU", "Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		System.out.println(pais);
		//retorna se existe a chave no map
		System.out.println(pais.containsKey("BR"));
		//retorna se existe o valor no map
		System.out.println(pais.containsValue("Brasil"));
		//recupera valor da chave
		System.out.println(pais.get("CN"));
		//remove conteudo associado a chave RU
		pais.remove("RU");
		
		System.out.println(pais);
		//retorna uma colecao do tipo Set
		//ou seja nao aceita elementos duplicados
		Set<String> keys = pais.keySet();
		
		for (String key : keys) {
			System.out.println(key + ":" + pais.get(key));
		}
		
	}
}
