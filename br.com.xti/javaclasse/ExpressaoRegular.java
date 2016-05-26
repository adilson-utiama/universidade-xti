package javaclasse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		//REGULAR EXPRESSION
		//Padrao de pesquisa e substituicao de texto
		//para validar dados eassegurar que esses dados estejan no seu formato
		
		/*
		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		System.out.println(b);
		*/
		
		boolean b1 = "Java".matches("Java");
		System.out.println(b1);//true
		boolean b2 = "Java".matches("java");
		//retorna falso, porque as espressoes sao sensiveis
		// a letras maiusculas e minusculas
		System.out.println(b2);//false
		
		
		/*MODIFICADORES
		 * (?i), Ignora Maiusculas e Minusculas
		 * (?x), Comentarios
		 * (?m), Multilinhas
		 * (?s), Dottal     */
		 
		//usando (?i)
		boolean b3 = "Java".matches("(?i)java");
		System.out.println(b3);//true
		//usando em conjunto (?im)
		boolean b4 = "Java".matches("(?im)java");
		System.out.println(b4);//true
		
		/*METACARACTERES
		 * . (ponto), qualquer caractere (Procura qualquer tipo de caracter
		 * \d , Digitos  [0-9] (qualquer numero de 0 a 9)
		 * \D , Nao é Digito [^0-9] (qualquer coisa que nao seja numero)
		 * \s , Espacos   [ \t ,\n ,\x0b,\f,\r ] 
		 * 		\t = tabulacao
		 * 		\n = quebra de linha
		 * 		\x0b =
		 * 		\f = 
		 * 		\r = 
		 * \S , Nao é espaco [^ , \s] (qualquer coisa que nao seja espaco)
		 * \w , Letra  [a-z , A-Z , 0-9] ( letras e numeros )
		 * \W , Nao é Letra ( qualquer coisa que nao seja letras e numeros)
		 * */
		
		boolean b5 = "@".matches(".");
		System.out.println(b5);//true
		b5 = "2".matches("\\d");
		System.out.println(b5);//true
		b5 = "a".matches("\\d");//retorna flaso porque a nao e um digito numerico
		System.out.println(b5);//false
		b5 = "a".matches("\\w");
		System.out.println(b5);//true
		b5 = "#".matches("\\w");
		System.out.println(b5);//false
		b5 = " ".matches("\\s");
		System.out.println(b5);//true
		b5 = "R".matches("\\s");
		System.out.println(b5);//false
		b5 = "Pi".matches(".");//procura por um unico caracter
		System.out.println(b5);//false
		b5 = "Pi".matches("..");//procura por dois caracteres
		System.out.println(b5);//true
		b5 = "21".matches("\\d\\d");//procura por dois digitos
		System.out.println(b5);//true
		
		//Exemplo validacao de cep
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b5 = "70294-70".matches(cep);
		System.out.println(b5);//true
		
		
		/*QUANTIFICADORES
		 * X{n}  X, exatamente n vezes
		 * X{n,} X, pelo menos n vezes
		 * X{n,m}  X, pelo menos n mas nao mais do que m vezes
		 * X?   X, 0 ou 1 vez
		 * X*   X, 0 ou + vezes
		 * X+   X, 1 ou + vezes
		 * */
		b5 = "21".matches("\\d{2}");//procura por exatamente 2 digitos
		System.out.println(b5);//true
		b5 = "123".matches("\\d{2,}");//procura por 2 digitos pelo menos
		System.out.println(b5);//true
		b5 = "1".matches("\\d{2,}");
		System.out.println(b5);//false
		b5 = "12345".matches("\\d{2,5}");//procura por 2 ate 5 digitos
		System.out.println(b5);//true
		b5 = "123456".matches("\\d{2,5}");
		System.out.println(b5);//false
		b5 = "".matches(".?");//procura por 0 ou 1 vez
		System.out.println(b5);//true
		b5 = "".matches(".*");//0 ou mais vezes
		System.out.println(b5);//true
		b5 = "ab".matches(".+");//1 ou mais vezes
		System.out.println(b5);//true
		b5 = "".matches(".+");//1 ou mais vezes
		System.out.println(b5);//false
		
		//Exemplo validacao de cep
		String cep2 = "\\d{5}-\\d{3}";
		b5 = "70294-70".matches(cep2);
		System.out.println(b5);//true
		
		
		
		/*METACARACTERES DE FRONTEIRA
		 * ^   inica
		 * $   finaliza
		 * |   ou
		 * */
		
		b5 = "Pier21".matches("^Pier.*");
		//procura por Pier no inicio (^Pier) e termina com 21 (.*)
		System.out.println(b5);//true
		
		b5 = "Pier21".matches(".*21$");
		//terminando com 21(21$)
		System.out.println(b5);//true
		
		b5 = "tem java aqui".matches(".*java.*");
		//procurando por java dentro da string
		System.out.println(b5);//true
		
		b5 = "tem java aqui".matches("^tem.*aqui$");
		//comeca com tem(^tem), qualquer caracter no meio(.*)
		//termina com aqui(aqui$)
		System.out.println(b5);//true
		
		b5 = "sim".matches("sim|nao");
		//procura por sim OU nao
		System.out.println(b5);//true
		
		/*AGRUPADORES
		 * [...]          , Agrupamento
		 * [a-z]          , Alcance ( a ate z )
		 * [a-e][i-u]     , Uniao  ( a ate e + i ate u )
		 * [a-z&&[aeiou]] , Intersecao (a ate z + (aeiou))
		 * [^abc]         , Excecao ( tudo que nao for abc )
		 * [a-z&&[^m-p]]  , Subtracao
		 * \x             , Fuga Literal
		 * */
		
		b5 = "x".matches("[a-z]");
		//procura de a ate z
		System.out.println(b5);//true
		b5 = "2".matches("[a-z]");
		System.out.println(b5);//false
		b5 = "A".matches("[a-z]");
		System.out.println(b5);//false
		b5 = "3".matches("[0-9]");
		//procura de 0 - 9
		System.out.println(b5);//true
		b5 = "true".matches("[tT]rue");//true e True
		System.out.println(b5);//true
		b5 = "true".matches("[tT]rue|[yY]es");
		//true e True OU yes Yes
		System.out.println(b5);//true
		b5 = "Beatriz".matches("[A-Z][a-zA-Z]*");//Primeiro Nome
		System.out.println(b5);//true
		
		b5 = "olho".matches("[^abc]lho");//nao comeca com abc e termina com lho
		System.out.println(b5);//true
		b5 = "alho".matches("[^abc]lho");//nao comeca com abc e termina com lho
		System.out.println(b5);//false
		
		b5 = "crau".matches("cr[ae]u");//crau ou creu
		System.out.println(b5);//true
		
		b5 = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
		//validacao simples de e-mail
		System.out.println(b5);//true
		
		//retorna todas as ocorrencia da palavra doce
		//nas diferentess formas escritas
		//metodo Pattern.compile e usado quando precisar usar
		//as expression muitas vezes
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		
		/*SUBSTITUICOES
		 * 
		 * */
		//substitui todas as ocorrencias de doce para DOCINHO
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		r = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		String url = "www.xti.com.br/clientes-2011.html";
		//http://www.xti.com.br/2011/clientes.jsp  //Objetivo da reestruturacao
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b5 = url.matches(re);
		System.out.println(b5);//true
		System.out.println(url);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		r = url.replaceAll(re, "http://$1\\/$3/$2.jsp");
		System.out.println(r);
	}

}
