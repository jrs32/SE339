package hw3.Calc;

public class CalMain {
	public static void main(String[] args) {
		String input = "";
		if(args.length > 0){ // If it is called with a cmd line argument, use it
			input = args[0];
		}
		//input = "3+42-1*2+2.3="; // Reads as 3 + 42 - 12 + 23
		input = "+3=+4=c4-2=";
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
				exit();
			}
			
		}

		System.out.println(cal.getResult());
	}
}
