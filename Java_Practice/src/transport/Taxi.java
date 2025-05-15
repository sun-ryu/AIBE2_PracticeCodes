package transport;

public class Taxi {
	public String vehicleType;
	public int passengerCount;
	public int money;
	
	public Taxi(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(vehicleType + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
