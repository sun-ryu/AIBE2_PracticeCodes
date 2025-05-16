package java20250513;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] scores = new int[4];
		scores[0] = 97;
		scores[1] = 90;
		scores[2] = 91;
		scores[3] = 98;
		
		int sum = 0;
		
		for (int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"] : " + scores[i]);
			sum = sum + scores[i];
		}
		System.out.println(sum);
	}

}
