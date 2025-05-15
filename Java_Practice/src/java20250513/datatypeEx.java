package java20250513;

public class datatypeEx {

	public static void main(String[] args) {
		String name1 = "choco";
		String name2 = name1;
		String name3 = "ami";
		String name4 = null;
		
		System.out.println(name4.length());
		System.out.println(name1 == name2);
		// 같은 메모리 주소를 가지고있기 때문에 true (같은 값을 가지고있는것 아님)

	}

}
