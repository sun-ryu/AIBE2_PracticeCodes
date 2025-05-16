package transport;

public class Subway {
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway(String lineNumber) // 지하철 노선 초기화
	{
		this.lineNumber = lineNumber;
	}
	public void take(int money) // 승객이 낸 돈을 받음
	{
		this.money += money; // 버스의 수입증가
		passengerCount++; // 승객수 증가
	}
	public void showInfo() { // 버스 정보를 출력하는 함수
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
