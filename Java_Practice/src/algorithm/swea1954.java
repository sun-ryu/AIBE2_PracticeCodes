package algorithm;

public class swea1954 {

	public static void main(String[] args) {
				
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
				
		int N = arr.length; // ���� ����
		int M = arr[0].length; // ���� ����
			
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

	}
}
