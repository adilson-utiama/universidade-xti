package javaclasse;

public class StringToken {

	public static void main(String[] args) {

		String s = "XHTML; CSS; JavaScript; JQuery; Java ";
		//metodo split da classe String
		//divide a string onde o delimitador esta
		//com Delimitador " ; ", podendo ser outro delimitador
		//Ex: " "(espaco),","(virgula)....
		//s.split(";");
		String s1 = "Venha trabalhar na XTI";
		//Criando um array de strings com metodo split
		String[] tokens = s.split(";");
		System.out.println(tokens.length + " tokens");
		for(String token : tokens){
			System.out.print(token);
		}
		System.out.println();
		//agora usando delimitador " "(espaco).
		String[] tokens1 = s1.split(" ");
		System.out.println(tokens1.length + " tokens");
		for(String token1 : tokens1){
			System.out.println(token1);
		}
		
		
		
	}

}
