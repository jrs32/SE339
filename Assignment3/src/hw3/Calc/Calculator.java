package hw3.Calc;

public class Calculator {

	// Calculator's current state
	private calcState state;
	
	// The number stored in memory from previous calculations
	private int memory;
	
	// What currently is showing on the calculator
	private String display;
	
	// "+" or "-" waiting to be executed
	private char pendingOperation;
	
	public Calculator(){
		reset();
	}
	
	// If "Clear" is pressed on the calculator
	public void reset(){
		display = "0";
		memory = 0;
		state = startState.singleton;
		pendingOperation = ' ';
	}
	
	// If a number is pressed on the calculator
	public void addDigit(char digit){
		state.Digit(this, digit);
	}
	
	// If "+" or "-" is pressed on the calculator
	public void Operation(char c){
		state.Operation(this, c);
	}
	
	// If "=" is pressed on the calculator
	public void Equals(){
		state.Equal(this);
	}
	
	public void setState(calcState newState){
		state = newState;
	}
	
	public String getDisplay(){
		return display;
	}
	
	public void setDisplay(String newDisplay){
		display = newDisplay;
	}
	
}
