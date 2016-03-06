package hw3.Calc;

/************************************************************
 * 					Compute Without Pending State
 * 
 * The calculator is in the compute without pending state after the 
 * user presses "=" to get result
 **********************************************************/
public class ComputeWithoutPending extends CalcState{

	public static final ComputeWithoutPending singleton = new ComputeWithoutPending();
	private ComputeWithoutPending() {} 
	
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
		calc.getResult();
	}

}
