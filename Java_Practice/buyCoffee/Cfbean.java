package buyCoffee;

public class Cfbean {
	public String cfbeanMenu;
	public int price;
	int customer;
	int money;
	
	public Cfbean(String cfbeanMenu, int price) {
		this.cfbeanMenu = cfbeanMenu;
		this.price = price;
	}
	public void take(int money) {
		this.money += price;
		customer++;
	}
	public void showInfo() {
		System.out.println("Ŀ�Ǻ󿡼� " + cfbeanMenu + "�� ������ �մ��� " + customer + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
