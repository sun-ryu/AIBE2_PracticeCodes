package java20250515;

public class Student {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String adress;
	
	public Student() {
		//�л��� ������ �� ���� ����
		serialNum++;
		//������ ���� �й� �ν��Ͻ��� �ο�
		studentID = serialNum;
	}
		
	public void setStudentName(String name) {
		studentName = name;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
}
