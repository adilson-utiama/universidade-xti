package poo;

public class MetodoSobreTeste {

	public static void main(String[] args) {
		/*
		 * METODOS SOBRECARREGADOS]
		 * 
		 * Tem o mesmo nome
		 * 
		 * com assinaturas diferentes
		 */

		MetodoSobre m = new MetodoSobre();
		
		System.out.println(m.media(5));
		System.out.println(m.media(5, 3));
		System.out.println(m.media("50", "30"));
		System.out.println(m.media(5,3,34,56));
		
	}

}
