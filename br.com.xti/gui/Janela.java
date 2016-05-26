package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/*  CRIACAO DE UMA JANELA SIMPLES */

	//classe estendendo da classe JFramme (extends)
public class Janela extends JFrame{
	//metodo construtor da janela
	public Janela(){
		
		//inicializa o jframe
		//JFrame frame = new JFrame(); //caso a classe estende da JFrame, nao sera necessario crialo 
		//inicializacao a partir da super classe JFrame
		super("Minha Janela");
		//atributos
		//criacao de um botao atraves da classe Button
		JButton botao = new JButton("Clique");
		//construcao de um container para receber componentes
		//frame.getContentPane().add(botao);
		/* Se a classe estende direto da JFrame, pode-se chamar direto os metodos */
		getContentPane().add(botao);
		//evento padrao para fechamento da janela
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tamanho da janela
		//frame.setSize(400, 400);
		setSize(400, 400);
		//ficar visivel ao usuario
		//frame.setVisible(true);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		//chamada do metodo janela
		new Janela();
	
	}

}
