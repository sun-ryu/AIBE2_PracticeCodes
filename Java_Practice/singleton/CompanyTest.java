package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// Company myCompany3 = new Company(); // �� �����ڴ� �Ⱥ��δٰ� ������
		
		System.out.println( myCompany1 );
		System.out.println( myCompany2 );
		System.out.println( myCompany1 == myCompany2 );

	}

}
