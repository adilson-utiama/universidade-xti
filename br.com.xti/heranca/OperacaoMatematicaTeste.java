package heranca;

public class OperacaoMatematicaTeste {
	
	//metodo estatico que acessa a partir da classe operacaoMatematica
	//metodos de suas sub-classes ( soma e multiplicacao)
	public static void calcule(OperacaoMatematica o, double x, double y){
		System.out.println(o.calcular(x, y));
	}
	
	//implementacao estruturada
	public static void calculeSemPolimorfismo(String o, double x, double y){
		if(o.equals("Soma")){
		System.out.println(x + y);
		}else if(o.equals("Multiplicacao")){
			System.out.println(x * y);
		}
	}

	public static void main(String[] args) {
		
		//metodos da sub-classe de operacaoMatematica
		//a partir da chamada do objeto calcule e possivel usar metodos
		//de soma e multiplicacao, sub-classes da operacaomatematica
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
	}
}
