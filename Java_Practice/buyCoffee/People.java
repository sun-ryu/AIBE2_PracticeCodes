package buyCoffee;

public class People {
	public String peopleName;
	public int age;
	public int money;
	public People(String peopleName, int money)
	{
		this.peopleName = peopleName;
		this.money = money;
	}
	public void buyStarbx(Starbx starbxMenu) {
		starbxMenu.take(starbxMenu.price);
		this.money -= starbxMenu.price;
		System.out.println(peopleName + "님이 스타벅스에서 " + starbxMenu.starbxMenu + "를 구매하였습니다.");
	}
	public void buyCfbean(Cfbean cfbeanMenu) {
		cfbeanMenu.take(cfbeanMenu.price);
		this.money -= cfbeanMenu.price;
		System.out.println(peopleName + "님이 커피빈에서 " + cfbeanMenu.cfbeanMenu + "를 구매하였습니다.");
	}
	public void showInfo() {
		System.out.println(peopleName + "님의 잔액은 " + money + "원 입니다.");
	}
}
