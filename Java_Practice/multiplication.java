
public class multiplication {

	public static void main(String[] args) {
		// 1.반복문 안에 또 다른 반복문을 중첩해서 사용하여 구구단을 출력 (2~9단)
		for ( int i = 2; i <= 9; i++ ) {
			for ( int j = 1; j <=9; j++ ) {
				System.out.println( i + " x " + j + " = " + i*j );
			}
		}
		
		// 2.구구단에서 짝수단만 출력
		for ( int i = 2; i <= 9; i++ ) {
			if ( i % 2 == 0 ) {
			for ( int j = 1; j <=9; j++ ) {
				System.out.println( i + " x " + j + " = " + i*j );
				}
			}
		}
		
		// 3.구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		for ( int i = 2; i <= 9; i++ ) {
			for ( int j = 1; j <=9; j++ ) {
				if ( i >= j ) {
					System.out.println( i + " x " + j + " = " + i*j );
				}
			}
		}
		
	}
	
}
