package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/xti/br.com.xti/files/texto.txt");
		//retorna o caminho absoluto do arquivo
		path.toAbsolutePath();
		//ex
		System.out.println(path.toAbsolutePath());
		//mostra o diretorio pai
		System.out.println(path.getParent());
		
		/* CRIACAO DE DIRETORIOS */
		
		//Para criar o diretorio onde sera armazenado o arquivo
		//Pode nao ser possivel criar o diretorio, entao e criado uma IOException
		Files.createDirectories(path.getParent());
		
		/* ESCREVER E LER ARQUIVOS */
		
		//criar o arquivo e insere texto
		byte[]bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);//cria, limpa, escreve
		
		//le o arquivo
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
		
	}

}
