package hw3.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args){
		JFrame frame = new JFrame("Calculator");
    	frame.getContentPane().add(new GUI(), BorderLayout.CENTER);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.pack();
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
	}
}
