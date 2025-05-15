package transport;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) // 버스번호를 매개변수로 받는 생성자
	{
		this.busNumber = busNumber;
	}
	public void take(int money) // 승객이 낸 돈을 받음
	{
		this.money += money; // 버스의 수입증가
		passengerCount++; // 승객수 증가
	}
	public void showInfo() { // 버스 정보를 출력하는 함수
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
