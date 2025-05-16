package java20250513;

public class Delta_Practice {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		// N*N
		int N = arr.length;
		// 현재 나의 좌표
		int r = 0, c = 0;
		// 4방 탐색(상하좌우)
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		for (int d=0; d<4;d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			// 위치에 따라 문제 발생할 수 있다.
			// 경계확인
			// 1.범위 안
			if(nr >= 0 && nr < N && nc >=0 && nc < N) {
				System.out.println(arr[nr][nc]);
			}
			// 2.범위 안이 아니면 안하겠다(버리기)
			if(nr < 0 || nr >= N || nc<0 || nc >=N ) continue;
			System.out.println(arr[nr][nc]);
		}
		// 8방 탐색(상, 우상, 우, 우하, 하, 좌하, 좌, 좌상)
		
	}

}
