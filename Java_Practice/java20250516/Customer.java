package java20250516;

public class Customer {
	
	protected int customerID; // 고객아이디
	protected String customerName; // 고객이름
	protected String customerGrade; // 고객등급
	int bonusPoint; // 보너스포인트
	double bonusRatio; // 적립비율
	
	public Customer() {
		customerGrade = "SILVER"; // 기본등급
		bonusRatio = 0.01; // 포인트 적립 비율
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 포인트 계산
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
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
