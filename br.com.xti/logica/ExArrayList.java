package logica;
import java.util.ArrayList;

public class ExArrayList {

	public static void main(String [] args){
	
		ArrayList<String> cores = new ArrayList<>();
		
		// add adiciona valores ao arraylist
		cores.add("Branco");
		// o "0" representa a posicao que o valor ocupara, substituindo(empurando) o valor que la estiver
		cores.add(0,"Vermelho");
		cores.add("Amarelo");
		cores.add("Azul");
		cores.add("Coco");
		
		//metodo toString() retorna os valores contidos no arraylist
		System.out.println(cores.toString());
		//metodo size() retorna quantidade de valores do arraylist
		System.out.println("Quantidade de Cores = " + cores.size());
		//metodo get() retorna a valor da posicao indicada (2)
		System.out.println("Posicao 2 = " + cores.get(2));
		//metodo indexOf() retorna o indice do valor informado
		System.out.println("Indice Branco = " + cores.indexOf("Branco"));
		//para remover um valor do arraylist
		cores.remove("Coco");
		//contains() retorna um valor boolean
		//cores.contains("Amarelo");
		
		System.out.println("Tem a cor Amarela? " + cores.contains("Amarelo"));
		System.out.println("Tem a cor Cinza? " + cores.contains("Cinza"));
		System.out.println(cores.toString());
	
	}

}