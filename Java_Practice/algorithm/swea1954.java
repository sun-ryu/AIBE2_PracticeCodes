package algorithm;

public class swea1954 {

	public static void main(String[] args) {
				
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
				
		int N = arr.length; // 행의 길이
		int M = arr[0].length; // 열의 길이
			
		for(int i=0; i<N; i++) {
			// 정방향
			if(i % 2 == 0) {
				for(int j=0; j<M; j++) {
					System.out.printf("%3d",arr[i][j]);
				}
			} else { // 역방향
				for(int j=M-1; j>=0; j--) {
					System.out.printf("%3d",arr[i][j]);
				}
			}
			System.out.println();
		}

	}
}
