package logica;
import javax.swing.JOptionPane;

public class EntradaJOptionPane {
	
	public static void main(String []args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu Nome? ");
		JOptionPane.showMessageDialog(null,("Bem Vindo ") + nome);
		
		
	
	}

}