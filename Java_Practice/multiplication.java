
public class multiplication {

	public static void main(String[] args) {
		// 1.�ݺ��� �ȿ� �� �ٸ� �ݺ����� ��ø�ؼ� ����Ͽ� �������� ��� (2~9��)
		for ( int i = 2; i <= 9; i++ ) {
			for ( int j = 1; j <=9; j++ ) {
				System.out.println( i + " x " + j + " = " + i*j );
			}
		}
		
		// 2.�����ܿ��� ¦���ܸ� ���
		for ( int i = 2; i <= 9; i++ ) {
			if ( i % 2 == 0 ) {
			for ( int j = 1; j <=9; j++ ) {
				System.out.println( i + " x " + j + " = " + i*j );
				}
			}
		}
		
		// 3.�������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ���
		for ( int i = 2; i <= 9; i++ ) {
			for ( int j = 1; j <=9; j++ ) {
				if ( i >= j ) {
					System.out.println( i + " x " + j + " = " + i*j );
				}
			}
		}
		
	}
	
}
