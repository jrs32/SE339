package hw3.gui;

import hw3.Calc.Calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI extends JPanel {

	Calculator calc = new Calculator();
	
	JLabel display = new JLabel("0");
	
	JButton digit0 = new JButton("0");
	JButton digit1 = new JButton("1");
	JButton digit2 = new JButton("2");
	JButton digit3 = new JButton("3");
	JButton digit4 = new JButton("4");
	JButton digit5 = new JButton("5");
	JButton digit6 = new JButton("6");
	JButton digit7 = new JButton("7");
	JButton digit8 = new JButton("8");
	JButton digit9 = new JButton("9");
	
	JButton Clr = new JButton("C");
	JButton Add = new JButton("+");
	JButton Sub = new JButton("-");
	JButton Eql = new JButton("=");
	
	//   Instantiate the GUI       
	public GUI() {
		setLayout(new BorderLayout());
		add(display, BorderLayout.NORTH);
		add(digitButtons(), BorderLayout.WEST);
		add(calcButtons(), BorderLayout.EAST);
	}
	
	// Create a Panel storing all Digit Buttons
	public JPanel digitButtons(){
		JPanel buttons = new JPanel();
		JPanel buttonsUpper = new JPanel();
		JPanel buttonsMiddle = new JPanel();
		JPanel buttonsLower = new JPanel();
		
		digitListener dl = new digitListener();
		digit0.addActionListener(dl);
		digit1.addActionListener(dl);
		digit2.addActionListener(dl);
		digit3.addActionListener(dl);
		digit4.addActionListener(dl);
		digit5.addActionListener(dl);
		digit6.addActionListener(dl);
		digit7.addActionListener(dl);
		digit8.addActionListener(dl);
		digit9.addActionListener(dl);
		
		buttonsUpper.add(digit7);
		buttonsUpper.add(digit8);
		buttonsUpper.add(digit9);
		
		buttonsMiddle.add(digit4);
		buttonsMiddle.add(digit5);
		buttonsMiddle.add(digit6);
		
		buttonsLower.add(digit1);
		buttonsLower.add(digit2);
		buttonsLower.add(digit3);
		
		JPanel buttonsBottom = new JPanel();
		buttonsBottom.setLayout(new BorderLayout());
		buttonsBottom.add(buttonsLower, BorderLayout.NORTH);
		buttonsBottom.add(digit0, BorderLayout.CENTER);
		
		buttons.setLayout(new BorderLayout());
		buttons.add(buttonsUpper, BorderLayout.NORTH);
		buttons.add(buttonsMiddle, BorderLayout.CENTER);
		buttons.add(buttonsBottom, BorderLayout.SOUTH);
		buttons.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		return buttons;
	}
	
	// Create a Panel storing all the Other Buttons
	public JPanel calcButtons(){
		JPanel buttons = new JPanel();
		
		operationListener ol = new operationListener();
		
		Clr.addActionListener(ol);
		Add.addActionListener(ol);
		Sub.addActionListener(ol);
		Eql.addActionListener(ol);
		
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		
		top.setLayout(new BorderLayout());
		bottom.setLayout(new BorderLayout());
		
		top.add(Clr, BorderLayout.NORTH);
		top.add(Add, BorderLayout.SOUTH);
		bottom.add(Sub, BorderLayout.NORTH);
		bottom.add(Eql, BorderLayout.SOUTH);
		
		buttons.setLayout(new BorderLayout());
		buttons.add(top, BorderLayout.NORTH);
		buttons.add(bottom, BorderLayout.SOUTH);
		
		return buttons;
	}
	
	
	// Action Listener for when a Digit is Pressed
	public class digitListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// Get Char Value of button pressed and addDigit
			calc.addDigit(((JButton) arg0.getSource()).getText().charAt(0));
			display = new JLabel(calc.getDisplay());
		}
	}
	
	// Action Listener for when an operation button is pressed
	public class operationListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// Get Char Value of button pressed
			char c = (((JButton) arg0.getSource()).getText().charAt(0));
			
			if(c == 'C'){ calc.reset(); }
			else if(c == '='){ calc.Equals(); }
			else if(c == '+' || c == '-'){ calc.Operation(c); }
			
			display = new JLabel(calc.getDisplay());
		}
	}
	
}
