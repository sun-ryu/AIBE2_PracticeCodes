package transport;

public class Subway {
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway(String lineNumber) // ����ö �뼱 �ʱ�ȭ
	{
		this.lineNumber = lineNumber;
	}
	public void take(int money) // �°��� �� ���� ����
	{
		this.money += money; // ������ ��������
		passengerCount++; // �°��� ����
	}
	public void showInfo() { // ���� ������ ����ϴ� �Լ�
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
