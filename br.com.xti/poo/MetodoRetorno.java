package poo;

public class MetodoRetorno {
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior de dois numeros
	 */
	int maior(int um, int dois){
		if(um > dois){
			return um;
		}else{
			return dois;
		}
	}	
	double soma(double um, double dois){
		double s = um + dois;
		return s;
	}
	
	//Argumentos  Variaveis
	// ... converte em um array
	double somaArg(double ... numeros){
		double total = 0;
		for(double n : numeros){ //foreach, percorre um array
			total += n;
		}
		return total;
	}
	
	
	}

