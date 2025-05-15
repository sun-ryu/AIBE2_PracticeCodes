package java20250513;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		for(int i=0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		for(int i=0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		System.arraycopy(array1, 0, array2, 2, 3);

		for(int i=0 ; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
