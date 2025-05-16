package buyCoffee;

public class buyCoffee {

	public static void main(String[] args) {
		People peopleVicky = new People("Vicky", 19000);
		People peopleSpencer = new People("Spencer", 5000);
		
		Starbx stbAmericano = new Starbx("아메리카노", 4000);
		Starbx stbLatte = new Starbx("라떼", 4700);
		
		Cfbean cfbAmericano = new Cfbean("아메리카노", 3800);
		Cfbean cfbLatte = new Cfbean("라떼", 4500);
		
		peopleVicky.buyStarbx(stbAmericano);
		peopleVicky.buyStarbx(stbAmericano);
		peopleVicky.buyCfbean(cfbAmericano); // 잔 수 한번에 어떻게 하는지 나중에 해보기!!
		peopleVicky.showInfo();

		peopleSpencer.buyCfbean(cfbLatte);
		peopleSpencer.showInfo();
		
		stbAmericano.showInfo();
		stbLatte.showInfo();
		cfbAmericano.showInfo();
		cfbLatte.showInfo();
	}
	
}
