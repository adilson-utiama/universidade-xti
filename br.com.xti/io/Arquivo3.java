package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import poo.Conta;

public class Arquivo3 {
	
	private Path path = Paths.get("C:/xti/br.com.xti/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException{
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas) {
				writer.write(conta.getCliente()+ ";" + conta.getSaldo() + "\n");
			}
		}
	}
	ArrayList<Conta> contas = new ArrayList<>();
	public ArrayList<Conta> recuperarContas() throws IOException{
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null){
				String[] t = line.split(";");
				//System.out.println(t[0]+t[1]);
				Conta conta = new Conta(t[0],Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	}
	

	public static void main(String[] args) throws IOException {

		ArrayList<Conta> contas = new ArrayList<>();
		/*
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.213));
		contas.add(new Conta("Beatriz", 23200.09));
		*/
		Arquivo3 operacao = new Arquivo3();
		//operacao.armazenarContas(contas);
		ArrayList<Conta> conta2 = operacao.recuperarContas();
		
		for(Conta conta : conta2){
			conta.exibeSaldo();
		}
		
	}

}
		
		
