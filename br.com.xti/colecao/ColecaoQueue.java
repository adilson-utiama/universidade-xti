package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		//Colecao Queue, representa uma fila de espera
		
		//regra FIFO ( First In First Out)
		//O primeiro a entrar e o primeiro a sair
		Queue<String> fila = new LinkedList<>();
		//adiciona elementos no final da fila
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.add("Beatriz");
		//offer faz o mesmo
		//fila.offer("Beatriz");
		System.out.println(fila);
		//nao remove apenas verifica qual elemento sera o proximo
		System.out.println(fila.peek());
		//remove o proximo elemento que esta no inicio da fila
		System.out.println(fila.poll());
		System.out.println(fila);
		
		/*Outros metodos disponiveis em LinkedList*/
		
		//Cast para linkedlist
		LinkedList<String> f = (LinkedList<String>) fila;
		//coloca no inicio da fila
		f.addFirst("Caio");
		//coloca no fim da fila
		f.addLast("Juliana");
		
		System.out.println(fila);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		//remove a primeira da fila
		f.pollFirst();
		//remove a ultima da fila 
		f.pollLast();
		
		System.out.println(fila);
	}
}
