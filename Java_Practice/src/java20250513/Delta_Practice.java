package java20250513;

public class Delta_Practice {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		// N*N
		int N = arr.length;
		// ���� ���� ��ǥ
		int r = 0, c = 0;
		// 4�� Ž��(�����¿�)
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		for (int d=0; d<4;d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			// ��ġ�� ���� ���� �߻��� �� �ִ�.
			// ���Ȯ��
			// 1.���� ��
			if(nr >= 0 && nr < N && nc >=0 && nc < N) {
				System.out.println(arr[nr][nc]);
			}
			// 2.���� ���� �ƴϸ� ���ϰڴ�(������)
			if(nr < 0 || nr >= N || nc<0 || nc >=N ) continue;
			System.out.println(arr[nr][nc]);
		}
		// 8�� Ž��(��, ���, ��, ����, ��, ����, ��, �»�)
		
	}

}
