package java20250516;

public class CustomerBuy {
	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer customerPark = new Customer();
		customerPark.setCustomerName("�ڻ�����");
		int payPark = customerPark.calcPrice(price);
		
		System.out.println(customerPark.customerName + "���� �����ؾ� �ϴ� �ݾ��� " + payPark + "�� �Դϴ�.");
		System.out.println(customerPark.showCustomerInfo());
		
		Customer customerYoon = new VIPCustomer();
		customerYoon.setCustomerName("������");
		int payYoon = customerYoon.calcPrice(price);
		
		System.out.println(customerYoon.customerName + "���� �����ؾ� �ϴ� �ݾ��� " + payYoon + "�� �Դϴ�.");
		System.out.println(customerYoon.showCustomerInfo());
		
//		Customer customerYeon = new VIPCustomer(); // ���� <- ����Ŭ���� ������ ����
//		VIPCustomer customerKim = new Customer(); // ���� <- ����Ŭ���� ������ �Ұ�

	}
}