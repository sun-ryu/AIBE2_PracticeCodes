package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// Company myCompany3 = new Company(); // 이 생성자는 안보인다고 오류뜸
		
		System.out.println( myCompany1 );
		System.out.println( myCompany2 );
		System.out.println( myCompany1 == myCompany2 );

	}

}
