package hw3.Calc;

public class CalMain {
	public static void main(String[] args) {
		String input = "3+4=";
		Calculator cal = new Calculator();
		cal.setState(StartState.singleton);

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(Character.isDigit(c)){
				cal.addDigit(c);
			}
			else if('=' == c){
				cal.Equals();
			}
			else{
				cal.Operation(c);
			}
			
		}

		cal.getResult();
	}
}
