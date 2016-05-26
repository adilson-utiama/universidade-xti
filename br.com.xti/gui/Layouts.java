package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
	 
	public Layouts(){
		super("Layouts");
		
		Container c = getContentPane();
		/*CRIACAO DE UMA BORDER LAYOUT
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
		*/
		// CRIACAO DE UM FLOW LAYOUT botoes lado a lado
		//distribui de acordo com a ordem de chegada dos elementos
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Layouts();
	}

}
