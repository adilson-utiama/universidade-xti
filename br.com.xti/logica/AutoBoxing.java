package logica;
public class AutoBoxing{

	public static void main(String []args){
	
		//empacotamento forma antiga
		/*
		Integer x = new Integer(555); //empacota
		int a = x.intValue(); //desempacota
		a++; //incrementa
		x = new Integer(a); //re-empacota
		System.out.println(x.intValue());
		*/
		
		//empacotamento forma nova
		
		Integer x = 555; //empacota
		x++; //desempacota, incrementa, re-empacota
		System.out.println(x);
		
		
		//outro exemplo
		
		Boolean v = new Boolean("true"); //froma antiga
		// if(v.booleanValue()) { //para desempacotar da forma antiga
		if(v) { //pode se usar diretamente dessa forma
		   System.out.println(v);
		   }
	}

}