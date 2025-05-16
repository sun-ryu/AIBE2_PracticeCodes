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
		System.out.println(vehicleType + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
