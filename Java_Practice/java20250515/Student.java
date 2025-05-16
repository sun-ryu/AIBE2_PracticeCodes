package java20250515;

public class Student {
	private static int serialNum = 1000; // 모든 학생이 공유하는 고유한 학번 번호 (1000부터 시작)
	int studentID;
	String studentName;
	int grade;
	String adress;
	
	public Student() { // 생성자 - Student 객체가 만들어질때 자동으로 실행됨
		//학생이 생성될 때 마다 증가
		serialNum++;
		//증가된 값을 학번 인스턴스에 부여
		studentID = serialNum;
	}
		
	// 학생 이름 설정
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// 학생 이름, 학번 반환
	public String getStudentName() {
		return studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	
	// 마지막으로 사용된 학번 반환 (공용)
	public static int getSerialNum() {
		return serialNum;
	}
	
}
