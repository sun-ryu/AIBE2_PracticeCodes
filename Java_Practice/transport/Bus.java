package transport;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) // ������ȣ�� �Ű������� �޴� ������
	{
		this.busNumber = busNumber;
	}
	public void take(int money) // �°��� �� ���� ����
	{
		this.money += money; // ������ ��������
		passengerCount++; // �°��� ����
	}
	public void showInfo() { // ���� ������ ����ϴ� �Լ�
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
