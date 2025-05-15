package transport;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 생성
		Student studentChris = new Student("Chris", 5000);
		Student studentEmily = new Student("Emily", 10000);
		Student studentJenna = new Student("Jenna", 25000);
		
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100);
		studentChris.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentEmily.takeSubway(subwayGreen);
		studentEmily.showInfo();
		subwayGreen.showInfo();

		Taxi taxiYellow = new Taxi("일반택시");
		studentJenna.takeTaxi(taxiYellow);
		studentJenna.showInfo();
		taxiYellow.showInfo();
	}

}
