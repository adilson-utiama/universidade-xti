package javaclasse;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		//para retornar o valor string do objeto
		s1.toString();
		//informa o tamanho da string
		s1.length();
		//informa a capacidade de armazenamento 
		//de novos caracteres dentro objetos
		//sem alocar mais memoria
		s1.capacity();
		
		//System.out.println(s1);
		//s1.reverse();//inverte a String
		//System.out.println(s1);
		
		//append concatena strings sem que seja necessariariar novos objetos 
		s1.append(" Trabalho ");
		//tambem adicionando com uma array
		char[] c = {'c','o','m'};
		//ou chamar varias vezes o metodo
		s1.append(c).append("Textos.");
		System.out.println(s1);
		
		//metodo comum
		String s = "Oi" + " como " + "vai voce?";
		//metodo usando stringbuilder
		String sb = new StringBuilder("Oi")
		.append(" como ").append("vai voce?").toString();
		System.out.println(sb);
		
		//metodo delete deleta 
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		
	}

}
