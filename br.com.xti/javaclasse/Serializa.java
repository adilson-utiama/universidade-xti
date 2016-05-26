package javaclasse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import poo.Conta;

public class Serializa {
	
	/* SERIALIZACAO DE OBJETOS */
	//SO PODEM SER SERIALIZADAS OBJETOS QUE IMPLEMENTAM
	//java.io.Serializable
	//So sao serializadas variaveis do OBJETO, nao da classe
	//variaveis static nao sao serializadas, pois pertencem a classe
	//para nao serializar variaveis, utilize o 
	//o modificador transient, impede que a variavel seja serializada 

	public static void main(String[] args) throws Exception {
		
		String[] nomes = {"Ricardo","Beattriz","Sandra"};
		
		/* ESCRITA DE OBJETO */
		
		FileOutputStream fos = new FileOutputStream("C:/xti/br.com.xti/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nomes);
		oos.close();
		
		/* LEITURA DE OBJETO */
		
		FileInputStream fis = new FileInputStream("C:/xti/br.com.xti/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		String[] nomes1 = (String[])ois.readObject();
		ois.close();
		
		System.out.println(Arrays.toString(nomes1));
		
		
		/* USANDO O EXEMPLO DA CONTA */
		
		ContaSerializa conta1 = new ContaSerializa("XTI", 111_222_333.444);
		ContaSerializa conta2 = new ContaSerializa("BIR", 111_222_333.444);
		
		FileOutputStream fos2 = new FileOutputStream("C:/xti/br.com.xti/files/conta.ser");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(conta1);
		oos2.writeObject(conta2);
		oos2.close();
		
		FileInputStream fis2 = new FileInputStream("C:/xti/br.com.xti/files/conta.ser");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		ContaSerializa c1 = (ContaSerializa)ois2.readObject();
		ContaSerializa c2 = (ContaSerializa)ois2.readObject();
		ois2.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
	}
}


