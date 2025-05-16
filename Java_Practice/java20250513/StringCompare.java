package java20250513;

public class StringCompare {

	public static void main(String[] args) {
		String name1 = "choco";
		String name2 = "choco";
		if(name1 == name2) {
			System.out.println("name1과 name2는 참조가 같다.");
		} else {
			System.out.println("name1과 name2는 참조가 다르다.");
		}
		if(name1.equals(name2)) {  // 객체와 상관없이 문자열만 비교할때 equals()
			System.out.println("name1과 name2는 문자열이 같다.");
		}

		String name3 = new String("choco");
		String name4 = new String("choco");
		if(name3 == name4) {
			System.out.println("name3과 name4는 참조가 같다.");
		} else {
			System.out.println("name3과 name4는 참조가 다르다.");
		}
		if(name3.equals(name4)) {
			System.out.println("name3과 name4는 문자열이 같다.");
		}
	}

}
