package hw3.Calc;

/************************************************************
 * 					Start State
 * 
 * The calculator is in the start state when it is first 
 * turned on or cleared. 
 **********************************************************/
public class StartState extends CalcState{

	// Singleton Instance - For setting the state
	public static final StartState singleton = new StartState();
	private StartState() {} 
	
	@ Override
	public void Digit(Calculator calc, char c) {
        calc.setDisplay("" + c);
        if ('0' != c) { // Only advance to Accumulate State if a non-zero digit 
            calc.setState(Operand1.singleton);
        }
	}

	public void Operation(Calculator calc, char c) {
		// TODO Auto-generated method stub
		
	}

	public void Equal(Calculator calc) {
		// TODO Auto-generated method stub
		
	}

}
