package hw3.Calc;

/************************************************************
 * 					Start State
 * 
 * The calculator is in the start state when it is first 
 * turned on or cleared. 
 **********************************************************/
public class startState extends calcState{

	// Singleton Instance - For setting the state
	public static final startState singleton = new startState();
	private startState() {} 
	
	@ Override
	public void Digit(Calculator calc, char c) {
        calc.setDisplay("" + c);
        if ('0' != c) { // Only advance to Accumulate State if a non-zero digit 
            calc.setState(accumulateState.singleton);
        }
	}

	public void Operation(Calculator calc, char c) {
		// TODO Auto-generated method stub
		
	}

	public void Equal(Calculator calc) {
		// TODO Auto-generated method stub
		
	}

}
