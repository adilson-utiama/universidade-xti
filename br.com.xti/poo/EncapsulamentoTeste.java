package poo;

public class EncapsulamentoTeste {

	public static void main(String[] args) {

		Encapsulamento e = new Encapsulamento();
		//e.getNome();
		String n = e.getNome();
		e.setNome("Welington");
		
		String no = e.getNome();
		System.out.println(no);
		
	}

}
