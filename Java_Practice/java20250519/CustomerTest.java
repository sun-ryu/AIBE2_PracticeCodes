package java20250519;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		
		Buy buyer = customer;
		buyer.buy();
		// buyer.sell();
		
		Sell seller = customer;
		seller.sell();
		// seller.buy();
	}
}
