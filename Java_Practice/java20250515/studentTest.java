package java20250515;

public class studentTest {
    public static void main(String[] args) {
		Student studentYeon = new Student();
		studentYeon.setStudentName("������");
		System.out.println(Student.getSerialNum()); // �ʱⰪ ���
		System.out.println(studentYeon.studentName + " �й�: " + studentYeon.studentID);
		
		Student studentHong = new Student();
		studentHong.setStudentName("ȫ�浿");
		System.out.println(Student.getSerialNum()); // �ʱⰪ ���
		System.out.println(studentHong.studentName + " �й�: " + studentHong.studentID);
    }
}
