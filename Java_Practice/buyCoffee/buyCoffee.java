package buyCoffee;

public class buyCoffee {

	public static void main(String[] args) {
		People peopleVicky = new People("Vicky", 19000);
		People peopleSpencer = new People("Spencer", 5000);
		
		Starbx stbAmericano = new Starbx("�Ƹ޸�ī��", 4000);
		Starbx stbLatte = new Starbx("��", 4700);
		
		Cfbean cfbAmericano = new Cfbean("�Ƹ޸�ī��", 3800);
		Cfbean cfbLatte = new Cfbean("��", 4500);
		
		peopleVicky.buyStarbx(stbAmericano);
		peopleVicky.buyStarbx(stbAmericano);
		peopleVicky.buyCfbean(cfbAmericano); // �� �� �ѹ��� ��� �ϴ��� ���߿� �غ���!!
		peopleVicky.showInfo();

		peopleSpencer.buyCfbean(cfbLatte);
		peopleSpencer.showInfo();
		
		stbAmericano.showInfo();
		stbLatte.showInfo();
		cfbAmericano.showInfo();
		cfbLatte.showInfo();
	}
	
}
