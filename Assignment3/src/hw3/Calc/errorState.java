package hw3.Calc;

/************************************************************
 * 					error State
 * 
 * Calculator enters error state when bad input happens.
 * For example "5+==" would be bad input because there is two
 * back-to-back equals has nothing to compute
 **********************************************************/
public class errorState extends CalcState
{

	public static errorState singleton = new errorState();
	
	private errorState() {
	}
	
	@Override
	public void Digit(Calculator calc, char c) {
		// Does Nothing
	}

	@Override
	public void Operation(Calculator calc, char c) {
		// Does Nothing
	}

	@Override
	public void Equal(Calculator calc) {
		// Does Nothing
	}

}
