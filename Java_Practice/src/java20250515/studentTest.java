package java20250515;

public class studentTest {
    public static void main(String[] args) {
		Student studentYeon = new Student();
		studentYeon.setStudentName("연초코");
		System.out.println(Student.getSerialNum()); // 초기값 출력
		System.out.println(studentYeon.studentName + " 학번: " + studentYeon.studentID);
		
		Student studentHong = new Student();
		studentHong.setStudentName("홍길동");
		System.out.println(Student.getSerialNum()); // 초기값 출력
		System.out.println(studentHong.studentName + " 학번: " + studentHong.studentID);
    }
}
