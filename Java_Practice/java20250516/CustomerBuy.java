package java20250516;

public class CustomerBuy {
	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer customerPark = new Customer();
		customerPark.setCustomerName("박새로이");
		int payPark = customerPark.calcPrice(price);
		
		System.out.println(customerPark.customerName + "님이 지불해야 하는 금액은 " + payPark + "원 입니다.");
		System.out.println(customerPark.showCustomerInfo());
		
		Customer customerYoon = new VIPCustomer();
		customerYoon.setCustomerName("윤세리");
		int payYoon = customerYoon.calcPrice(price);
		
		System.out.println(customerYoon.customerName + "님이 지불해야 하는 금액은 " + payYoon + "원 입니다.");
		System.out.println(customerYoon.showCustomerInfo());
		
//		Customer customerYeon = new VIPCustomer(); // 상위 <- 하위클래스 생성자 가능
//		VIPCustomer customerKim = new Customer(); // 하위 <- 상위클래스 생성자 불가

	}
}