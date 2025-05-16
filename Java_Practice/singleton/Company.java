package singleton;

public class Company {
	// private
	private static Company instance = new Company();
	
	private Company() {} // 외부에서는 호출하고싶어도 못하게 막혀있음
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
	return instance;
	}
}
