package hw3.Calc;

/************************************************************
 * 					Compute Pending State
 * 
 * The calculator is in the compute state after the user 
 * presses "+", "-", "*", "/"
 **********************************************************/
public class ComputePending extends CalcState {

	// Singleton Instance - For setting the state
	public static ComputePending singleton = new ComputePending();
	private ComputePending() {}
	
	@Override
	public void Digit(Calculator calc, char c) {
		// TODO Auto-generated method stub
		if('0' != c){ 
			calc.appendInput(c);
			calc.setState(Operand2.singleton);
		}
	}

	@Override
	public void Operation(Calculator calc, char c) {
		// Previous entry was an operation, shouldn't add another operation
		
	}

	@Override
	public void Equal(Calculator calc) {
		// Previous entry was an operation, shouldn't try to equal without an operand2
	}

}
