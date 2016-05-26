package poo;
/*
 * METODOS SOBRECARREGADOS]
 * 
 * Tem o mesmo nome
 * 
 * com assinaturas diferentes
 */
public class MetodoSobre {
	
	double soma(double ...numeros){
		double total = 0;
		for(double n : numeros){
			total += n;
		}
		return total;
	}
	

	double media(int x){
		System.out.print("media(int x)");
		return x;
	}
	
	double media(int x , int y){
		System.out.print("media(int x , int y)");
		return (x + y)/2;
	}
	// dois metodos media com mesmo nome, realizando a mesma operacao
	// mas com parametros com tipos diferentes
	double media(String x , String y){
		System.out.print("media(String x , String y)");
		int ix = Integer.parseInt(x);// converte uma String em numeros inteiros
		int iy = Integer.parseInt(y);
		return (ix + iy)/2;
	}
	double media(double ... numeros){
		System.out.print("media(int ... numeros)");
		return this.soma(numeros)/numeros.length;
	}
}
