package java20250514;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeon = new Student();
		//studentYeon.studentName = "������";
		studentYeon.setStudentName("������");

		System.out.println(studentYeon.getStudentName());
	}

}
