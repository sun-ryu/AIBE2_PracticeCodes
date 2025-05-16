package java20250514;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeon = new Student();
		//studentYeon.studentName = "연초코";
		studentYeon.setStudentName("연초코");

		System.out.println(studentYeon.getStudentName());
	}

}
