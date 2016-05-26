package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/xti/br.com.xti/files/texto.txt");
		Path path2 = Paths.get("C:/xti/br.com.xti/files/texto2.txt");
		
		Charset utf8 = StandardCharsets.UTF_8;
		/*PARA SE USAR ESTE METODO, E NECESSARIO CRIAR UMA EXCEPTION
		//Buffer = repositorio de dados
		//vai armazenando dados para serem gravados no arquivo
		BufferedWriter w = Files.newBufferedWriter(path, utf8);
		//escrevendo e armazenando
		w.write("Texto");
		w.write("Texto");
		w.write("Texto");
		//flush , pega todo o conteudo armazenado e faz a gravacao
		w.flush();
		//fecha a ligacao com o arquivo
		w.close();
		*/
		
		//metodo antigo
		BufferedWriter w0 = null;//inicializa antes do try
		try{
			w0 = Files.newBufferedWriter(path, utf8);
			w0.write("Texto");
			w0.write("Texto");
			w0.write("Texto");
			w0.flush();
		}catch (IOException e){ //capta os erros
			e.printStackTrace();
		}finally{ //fecha se o instancia for diferente de null
			if(w0 != null){
				w0.close();
			}
		}
		
		//metodo a partir da versao 7
		// faz a inicializacao dentro do try
		try(BufferedWriter w = Files.newBufferedWriter(path2, utf8)){
			w.write("Texto \n"); // \n quebra de linha
			w.write("Texto \n");
			w.write("Texto \n");
			//w.flush();  < se faz automaticamente
		}catch (IOException e){ //capta os erros
			e.printStackTrace();
		}  //fecha automaticamente
			
		/* LEITURA */
		try(BufferedReader reader = Files.newBufferedReader(path2, utf8)){
			String line = null;
			// enquanto linha nao for vazia imprima
			// vai ler linha por linha ate que encontre uma linha vazia
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			}catch(IOException e){
				e.printStackTrace();
		}
	}

}
