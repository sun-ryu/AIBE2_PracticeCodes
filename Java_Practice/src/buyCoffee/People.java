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
		System.out.println(peopleName + "���� ��Ÿ�������� " + starbxMenu.starbxMenu + "�� �����Ͽ����ϴ�.");
	}
	public void buyCfbean(Cfbean cfbeanMenu) {
		cfbeanMenu.take(cfbeanMenu.price);
		this.money -= cfbeanMenu.price;
		System.out.println(peopleName + "���� Ŀ�Ǻ󿡼� " + cfbeanMenu.cfbeanMenu + "�� �����Ͽ����ϴ�.");
	}
	public void showInfo() {
		System.out.println(peopleName + "���� �ܾ��� " + money + "�� �Դϴ�.");
	}
}
