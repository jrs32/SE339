package hw3.Calc;

abstract class CalcState {

	// Null-Object Pattern: errorState does nothing
	final static CalcState errorState = new CalcState() { 
		public void Operation(Calculator calc, char c) {}
		public void Equal(Calculator calc) {}
		public void Digit(Calculator calc, char digit) { }
    };
    
    // ( 0-9 ) was pressed on the calculator
    public abstract void Digit(Calculator calc, char c);

    // '+' or '-' was pressed on the calculator
    public abstract void Operation(Calculator calc, char c);

    // '=' was pressed on the calculator
    public abstract void Equal(Calculator calc);
	
}