package java20250513;

public class StringCompare {

	public static void main(String[] args) {
		String name1 = "choco";
		String name2 = "choco";
		if(name1 == name2) {
			System.out.println("name1�� name2�� ������ ����.");
		} else {
			System.out.println("name1�� name2�� ������ �ٸ���.");
		}
		if(name1.equals(name2)) {  // ��ü�� ������� ���ڿ��� ���Ҷ� equals()
			System.out.println("name1�� name2�� ���ڿ��� ����.");
		}

		String name3 = new String("choco");
		String name4 = new String("choco");
		if(name3 == name4) {
			System.out.println("name3�� name4�� ������ ����.");
		} else {
			System.out.println("name3�� name4�� ������ �ٸ���.");
		}
		if(name3.equals(name4)) {
			System.out.println("name3�� name4�� ���ڿ��� ����.");
		}
	}

}
