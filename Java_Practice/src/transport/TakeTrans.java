package transport;

public class TakeTrans {

	public static void main(String[] args) {
		//�л� ����
		Student studentChris = new Student("Chris", 5000);
		Student studentEmily = new Student("Emily", 10000);
		Student studentJenna = new Student("Jenna", 25000);
		
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100);
		studentChris.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2ȣ��");
		studentEmily.takeSubway(subwayGreen);
		studentEmily.showInfo();
		subwayGreen.showInfo();

		Taxi taxiYellow = new Taxi("�Ϲ��ý�");
		studentJenna.takeTaxi(taxiYellow);
		studentJenna.showInfo();
		taxiYellow.showInfo();
	}

}
