package java20250514;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(85);
		scores.add(97);
		
		scores.remove(0);
		scores.remove(0);
		scores.remove(0);
		
		System.out.println(scores);

	}

}
