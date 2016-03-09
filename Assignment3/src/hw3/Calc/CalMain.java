package hw3.Calc;

public class CalMain {
	public static void main(String[] args) {
		String input = "";
		if(args.length > 0){ // If it is called with a cmd line argument, use it
			input = args[0];
		}
		else {
			input = "3+4="; // Sample Input
		}
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
			else if ('+' == c || '-' == c){
				cal.Operation(c);
			}
			else if('c' == c || 'C' == c){
				cal.memory = "";
				cal.state = StartState.singleton;
			}
			else{
				System.out.println("Incorrect format");
				return;
			}
			
		}
		if(cal.state != errorState.singleton){
			System.out.println(cal.getResult());
		}
	}
}
