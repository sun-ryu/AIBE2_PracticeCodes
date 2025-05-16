package java20250515;

public class Student {
	private static int serialNum = 1000; // ��� �л��� �����ϴ� ������ �й� ��ȣ (1000���� ����)
	int studentID;
	String studentName;
	int grade;
	String adress;
	
	public Student() { // ������ - Student ��ü�� ��������� �ڵ����� �����
		//�л��� ������ �� ���� ����
		serialNum++;
		//������ ���� �й� �ν��Ͻ��� �ο�
		studentID = serialNum;
	}
		
	// �л� �̸� ����
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// �л� �̸�, �й� ��ȯ
	public String getStudentName() {
		return studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	
	// ���������� ���� �й� ��ȯ (����)
	public static int getSerialNum() {
		return serialNum;
	}
	
}
