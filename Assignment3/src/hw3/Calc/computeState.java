package hw3.Calc;

/************************************************************
 * 					Compute State
 * 
 * The calculator is in the compute state after the user 
 * presses "+", "-", or "="
 **********************************************************/
public class computeState extends calcState {

	// Singleton Instance - For setting the state
	public static computeState singleton = new computeState();
	private computeState() {}
	
	@Override
	public void Digit(Calculator calc, char c) {
		// TODO Auto-generated method stub
		
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
