package hw3.Calc;

abstract class CalcState {
    
    // ( 0-9 ) was pressed on the calculator
    public abstract void Digit(Calculator calc, char c);

    // '+' or '-' was pressed on the calculator
    public abstract void Operation(Calculator calc, char c);

    // '=' was pressed on the calculator
    public abstract void Equal(Calculator calc);
	
}