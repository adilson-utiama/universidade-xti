package refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	
	//metodo fazendo carregamento de memoria
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for (int i=0; i< 100_000; i++) {
			list.add(i);
		}
		//retorna a quant livre de memoria
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_567;//total de bytes em 1 mb
		//retorna a quant de memoria disponivel em MB
		double total = rt.maxMemory()/MB;
		
		//total de memoria utilizada quanto metodo esta sendo executado
		double inicio = total - (carregarMemoria()/MB);
		System.out.println(total);
		System.out.println(inicio);
		
		//finaliza tudo que seja possivel
		rt.runFinalization();
		//forca a execucao do garbage collector
		rt.gc();
		
		double fim = total - (rt.freeMemory()/MB);
		System.out.println("Inicio: " + inicio + "\nFinal: " + fim);
	}
}
		
