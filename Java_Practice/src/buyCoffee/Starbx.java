package buyCoffee;

public class Starbx {
	public String starbxMenu;
	public int price;
	int customer;
	int money;
	
	public Starbx(String starbxMenu, int price) {
		this.starbxMenu = starbxMenu;
		this.price = price;
	}
	public void take(int money) {
		this.money += price;
		customer++;
	}
	public void showInfo() {
		System.out.println("��Ÿ�������� " + starbxMenu + "�� ������ �մ��� " + customer + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
