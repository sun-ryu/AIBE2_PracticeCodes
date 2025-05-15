package singleton;

public class Company {
	// private
	private static Company instance = new Company();
	
	private Company() {} // �ܺο����� ȣ���ϰ�; ���ϰ� ��������
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
	return instance;
	}
}
