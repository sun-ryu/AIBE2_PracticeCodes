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
		System.out.println("커피빈에서 " + cfbeanMenu + "를 구매한 손님은 " + customer + "명이고, 수입은 " + money + "원 입니다.");
	}
}
