import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		while ( true ) {
			String text = input.next();
			
			if ( text.equalsIgnoreCase("exit")) {
				break;
			}
			
			int age;
            try {
                age = Integer.parseInt(text);
            } catch (NumberFormatException e) {
                continue;
            }
			
			if ( age >= 19 ) {
				System.out.println("성인입니다.");
			}
			else {
				System.out.println("미성년입니다.");
			}
		}
	}
}
