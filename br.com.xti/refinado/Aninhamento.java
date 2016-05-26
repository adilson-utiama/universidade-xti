package refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame{
	
	 
	JButton botao;
	//Construtor da classe Aninhamento
	public Aninhamento(){
		super("Aninhamento");
		
		botao = new JButton("OK");
		botao.addActionListener(new ListenerAninhado());
		
		//Criacao de CLASSE ANONIMA
		//define-se direto no parametro, sem o nome, apenas com 
		//o nome da classe que deseja 
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("Classe Anonima executa" + botao.getText());				
			}
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 250);
		setVisible(true);
	}
	
	
	//CLASSE ANINHADA (classe dentro de classe)
	public class ListenerAninhado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe Aninhada executa" + botao.getText());
		}
		
	}	
		

	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		
		//Listener aninhado
		//
		Aninhamento.ListenerAninhado listener =
				janela.new ListenerAninhado();
	}
}
