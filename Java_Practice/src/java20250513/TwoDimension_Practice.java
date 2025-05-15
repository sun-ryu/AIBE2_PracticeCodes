package java20250513;

public class TwoDimension_Practice {
	
	// 행 우선 순회 (행의 좌표 int i / 열의 좌표 int j)
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int N = arr.length; // 행의 길이
		int M = arr[0].length; // 열의 길이
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// 행 역 우선 순회
		for(int i=0; i<N; i++) {
			for(int j=M-1; j>=0; j--) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// 열 우선 순회
		for(int j=0; j<M; j++) {
			for(int i=0; i<N; i++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// 열 역 우선 순회
		for(int j=0; j<M; j++) {
			for(int i=N-1; i>=0; i--) {
				System.out.printf("%3d",arr[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	// 지그재그 순회
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
		
		System.out.println("-----------");
		
	// 지그재그 2
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.printf("%3d", arr[i][j+(M-1-2*j)*(i%2)]);
				// i는 순서대로 그대로임, j가 바뀌는거라서 j만 계산해주는거
			}
			System.out.println();
		}
		
	}
}
