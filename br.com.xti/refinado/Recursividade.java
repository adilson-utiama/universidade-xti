package refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	/**
	 * METODOS REURSIVOS
	 * sao metodos que chamam a si mesmo
	 * 
	 */
	
	public static int soma(int x){
		if(x == 0){
			return x;
		}else{
			System.out.print(x + " ");
			//metodo chamando a si proprio
			return x + soma(x-1);
		}
	}
	
	public static int potencia(int x, int e){
		if(e == 1){
			return x;
		}else{
			//chamada de metodo recursivo
			return x * potencia(x, e - 1);
		}
	}
	
	
	public static void listar(Path path){
		if(Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		}else{
			String s = "\n" + path.toAbsolutePath();
			System.out.println(s.toUpperCase());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				for (Path p : stream) {
					//metodo recursivo
					listar(p);
				}
			}catch(Exception e){}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(soma(10));
		System.out.println(potencia(3, 4));
		
		listar(Paths.get("C:/xti/"));
	}
}
