package hw3.Calc;

/************************************************************
 * 					Operand1 State
 * 
 * The calculator is in the operand1 state when
 * the user is pressing numbers to append to the display
 **********************************************************/
public class Operand1 extends CalcState{

	// Singleton Instance - For setting the state
	public static Operand1 singleton = new Operand1();
	private Operand1() {}
	
	public void Digit(Calculator calc, char c) {
		// TODO Auto-generated method stub
		if(Character.isDigit(c)){
			calc.appendInput(c);
			calc.setState(Operand1.singleton);
		}
	}
	public void Operation(Calculator calc, char c) {
		// TODO Auto-generated method stub
		if('+' == c || '-' == c){
			calc.appendInput(c);
			calc.setState(ComputePending.singleton);
		}
		
	}
	public void Equal(Calculator calc) {
		// We only have one operand, equals shouldn't calculate anything
	}
	
}
