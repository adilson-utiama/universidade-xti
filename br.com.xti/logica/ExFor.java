package logica;
public class ExFor{

	public static void main(String []args){
		
		
		//imprimi apenas numeros pares de 1 a 20
		String texto = "";
		for(int i=0; i<20; i++) {
			if(i % 2 == 0) {
				texto += i + ",";
			}
		}
		System.out.println(texto);
	}

}