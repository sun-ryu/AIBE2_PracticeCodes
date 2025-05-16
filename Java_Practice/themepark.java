
public class themepark {

	public static void main(String[] args) {
		
		int myAge = 59;
		int enterFee;
		if ( myAge < 8 ) {
			enterFee = 1000;
		}
		else if ( myAge < 14 ) {
			enterFee = 2000;	
		}
		else if ( myAge < 20 ) {
			enterFee = 2500;
		}
		else if ( myAge >=60 ) {
			enterFee = 0;
		}
		else {
			enterFee = 3000;
		}

		System.out.println("I pay " + enterFee + " won because I'm " + myAge + " years old.");
		
	}

}
