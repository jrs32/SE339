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
			calc.appendInput(c);
			calc.setState(Operand2.singleton);
		}
	}

	@Override
	public void Operation(Calculator calc, char c) {
		// Execute Pending Operation and Reset to having no pending operation
		if('+' == c || '-' == c){
			calc.memory = calc.getResult();
			calc.appendInput(c);
			calc.setState(ComputePending.singleton);
		}
	}

	@Override
	public void Equal(Calculator calc) {
		calc.memory = calc.getResult();
		calc.setState(StartState.singleton);
	}

}
