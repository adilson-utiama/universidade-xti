package poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	public Conta(){};
	public Conta(String cliente, double saldo){
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
	public void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
	}
