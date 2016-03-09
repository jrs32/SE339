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
		if('0' != c){ 
			calc.appendInput(c);
			calc.setState(Operand2.singleton);
		}
	}

	@Override
	public void Operation(Calculator calc, char c) {
		System.out.println("Two operations shouldn't be called back-to-back");
		calc.setState(errorState.singleton); // Two operations shouldn't be called back-to-back
	}

	@Override
	public void Equal(Calculator calc) {
		System.out.println("'=' shouldn't directly follow an operation");
		calc.setState(errorState.singleton); // '=' shouldn't directly follow an operation
	}

}
