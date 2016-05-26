package poo;

public class Encapsulamento {
	/* METODOS E VARIAVEIS
	 * GET / IS
	 * 	Para Captura
	 * SET
	 * 	Para Configuracao
	 */
	private String nome;
	private boolean ativo;
	
	public String getNome(){
		return nome;  //retorna valor de nome
	}
	public void setNome(String n){  //String n, cria uma instancia n
		this.nome = n;  //this faz refencia a varivel nome
	}  
	public boolean isAtivo(){
		return ativo;
	}
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
}
