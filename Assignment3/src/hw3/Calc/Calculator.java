package hw3.Calc;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

	// Calculator's current state
	CalcState state;
	
	// The number stored in memory from previous calculations
	String memory;
	
	public Calculator(){
		reset();
	}
	
	// If "Clear" is pressed on the calculator
	public void reset(){
		memory = "";
		state = StartState.singleton;
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
	
	public void setState(CalcState newState){
		state = newState;
	}
	
	// Append user input to current memory
	public void appendInput(char c){
		memory += c;
	}
	
	// Evaluate the result from the current memory
	public String getResult(){
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = null;
		try {
			result = engine.eval(memory);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(result);
		return result.toString();
	}
	
}
