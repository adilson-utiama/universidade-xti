package javaclasse;

public class StringOperacoes {

	public static void main(String[] args) {
		
		
		String s1 = "Write Once";
		String s2 = s1 + " Run Anywhere";
		String s3 = new String("Java Virtual Machine");
		
		char[] array = {'J','a','v','a'};
		String s4 = new String(array);
		
		//OPERACOES
		int tamanho = s1.length();
		char letra = s1.charAt(0);//0 a length() -1
		String texto = s1.toString();
		System.out.println(texto);
		
		//LOCALIZACAO
		int posicao = s3.indexOf("Virtual");
		int ultima = s3.lastIndexOf('a');
		boolean vazia = s3.isEmpty();
		System.out.println(posicao);
		
		//COMPARACAO
		String xti = "XTI";
		boolean x = xti.equals("xti");//compara valores de Strings
		boolean xx = xti.equalsIgnoreCase("xti");//compara Strings ignorando case sensitive
		boolean xxx = xti.startsWith("TI");//retorna false pq nao comeca com TI
		boolean xxxx = xti.endsWith("TI");//true pq termina com TI
		System.out.println(x);//vai retornar FALSE pq "XTI" e diferente de "xti"
		System.out.println(xx);//vai retornar TRUE pq ignora o case sensitive
		
		int c = "amor".compareTo("bola");//-1 < 0 , pq amor e menor que bola, pq comeca com a
		int cc = "bola".compareTo("amor");// 1 > 0 , pq bola e maior que amor
		
		String so = "Olhe, Olhe";
		boolean o = so.regionMatches(true, 6, "Olhe", 0, 4);
		
		//EXTRACAO
		String l = "O Brasil e Lindo";
		String sl = l.substring(11);//extrai conteudo a partir da 11 posicao
		System.out.println(sl);
		sl = l.substring(2,8);//extrai conteudo entre a 2 e 8 posicao
		System.out.println(sl);
		
		//MODIFICACAO
		sl = l.concat(" que Maravilha");//concatena strings
		System.out.println(sl);
		//sl = l.replace('s', 'z');//troca caracteres dentro da string
		//System.out.println(sl);
		//sl = l.replaceFirst(" ", "X");
		//System.out.println(sl);
		//sl = l.replaceAll(" ", "X");
		//System.out.println(sl);
		sl = l.toUpperCase();//converte tudo para letras maiusculas
		System.out.println(sl);
		sl = l.toLowerCase();//converte para letras minusculas
		System.out.println(sl);
		
		System.out.println("    espacos    ".trim());
		//remove os espacos vazios antes e depois
		
		
		//StringBuffer
		
		
		
		
		
		
	}

}
