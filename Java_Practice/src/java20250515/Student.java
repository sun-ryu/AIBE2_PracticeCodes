package java20250515;

public class Student {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String adress;
	
	public Student() {
		//학생이 생성될 때 마다 증가
		serialNum++;
		//증가된 값을 학번 인스턴스에 부여
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
