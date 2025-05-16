
public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		if ( operator == '+') {
			result = num1 + num2;
		}
		else if ( operator == '-') {
			result = num1 - num2;
		}
		else if ( operator == '*') {
			result = num1 * num2;
		}
		else if ( operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println( "Please check again");
			return;
		}
		System.out.println(result);
	}

}
