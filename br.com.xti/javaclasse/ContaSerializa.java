package javaclasse;

public class ContaSerializa implements java.io.Serializable{
	
	static int x = 0;//nao podem ser seriallizadas
	String cliente;
	double saldo;
	//Exemplo transient
	// transient double saldo //nao permite ser serializada
	
	public ContaSerializa(){};
	public ContaSerializa(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	public void saca(double valor){
		//deduzir do saldo o valor do saque
		saldo = saldo - valor;
	}	
	public void deposita(double valor){
		saldo = saldo + valor;
	}	
	public void transferePara(ContaSerializa destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
	}
