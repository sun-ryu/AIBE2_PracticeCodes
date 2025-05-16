package java20250516;

public class Customer {
	
	protected int customerID; // �����̵�
	protected String customerName; // ���̸�
	protected String customerGrade; // �����
	int bonusPoint; // ���ʽ�����Ʈ
	double bonusRatio; // ��������
	
	public Customer() {
		customerGrade = "SILVER"; // �⺻���
		bonusRatio = 0.01; // ����Ʈ ���� ����
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ����Ʈ ���
		return price;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}
