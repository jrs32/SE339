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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Equal(Calculator calc) {
		// TODO Auto-generated method stub
		
	}

}