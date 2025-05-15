package java20250513;

public class TwoDimension_Practice {
	
	// �� �켱 ��ȸ (���� ��ǥ int i / ���� ��ǥ int j)
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int N = arr.length; // ���� ����
		int M = arr[0].length; // ���� ����
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// �� �� �켱 ��ȸ
		for(int i=0; i<N; i++) {
			for(int j=M-1; j>=0; j--) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// �� �켱 ��ȸ
		for(int j=0; j<M; j++) {
			for(int i=0; i<N; i++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// �� �� �켱 ��ȸ
		for(int j=0; j<M; j++) {
			for(int i=N-1; i>=0; i--) {
				System.out.printf("%3d",arr[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// ������� ��ȸ
		for(int i=0; i<N; i++) {
			// ������
			if(i % 2 == 0) {
				for(int j=0; j<M; j++) {
					System.out.printf("%3d",arr[i][j]);
				}
			} else { // ������
				for(int j=M-1; j>=0; j--) {
					System.out.printf("%3d",arr[i][j]);
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// ������� 2
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.printf("%3d", arr[i][j+(M-1-2*j)*(i%2)]);
				// i�� ������� �״����, j�� �ٲ�°Ŷ� j�� ������ִ°�
			}
			System.out.println();
		}
		
	}
}
