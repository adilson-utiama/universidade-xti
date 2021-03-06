package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {
		
	public Layouts2(){
		super("Layouts");
		Container c = getContentPane();
		/* BORDER LAYOUT COM ESPACAMENTO DE 5 PIXELS
		c.setLayout(new BorderLayout(5,5));
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER,new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W"));
		*/
		
		/* GRID LAYOUT - 2 linhas, 3 colunas
		c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		/* CRIACAO DE UM LAYOUT COM
		 * BORDER LAYOUT
		 * GRID LAYOUT EM CONJUNTO
		 */
		c.setLayout(new BorderLayout());
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Layouts2 ();
	}

}
