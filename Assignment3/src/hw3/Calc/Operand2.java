package hw3.Calc;

/************************************************************
 * 					Operand2 State
 * 
 * The calculator is in the operand1 state when
 * the user is pressing numbers after pressing operators
 **********************************************************/
public class Operand2 extends CalcState{
	public static final Operand2 singleton = new Operand2();
	private Operand2() {
	}

	@Override
	public void Digit(Calculator calc, char c) {
		// TODO Auto-generated method stub
		if(Character.isDigit(c)){
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
		calc.setState(ComputeWithoutPending.singleton);
	}

}
