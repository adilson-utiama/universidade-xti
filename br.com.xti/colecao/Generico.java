package colecao;

import java.util.ArrayList;

//define <E> para aceitar tipos genericos
public class Generico <E> {
	
	E elemento;
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	public E getElemento(){
		return elemento;
	}

	//caracter curinga ?
	//qualquer tipo que extenda Number
	//agora passa a aceitar um arraylist de inteiros, double, float...
	public double soma(ArrayList<? extends Number> lista){
		double total = 0;
		for(Number number : lista){
			total += number.doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		//Classe Generico, para trabalhar com tipos aonde nao se sabe exatamente 
		//que tipo de dado sera manipulado
		
		//pode-se definir o tipo
		Generico<String> g = new Generico<>();
		g.setElemento("Lago Paranoa");
		//g.setElemento(1235); //nao permite
		Generico<Integer> g2 = new Generico<>();
		g2.setElemento(1234);
		//g2.setElemento("Lago Paranoa"); //nao permite
		
		//pode-se acesar metodos da String
		g.getElemento().toUpperCase();
		
		System.out.println(g.getElemento());
	}
}
