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
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("�̼����Դϴ�.");
			}
		}
	}
}
