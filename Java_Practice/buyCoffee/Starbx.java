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
		System.out.println("스타벅스에서 " + starbxMenu + "를 구매한 손님은 " + customer + "명이고, 수입은 " + money + "원 입니다.");
	}
}
