package templateMethod;

public class SuperLevel extends PlayerLevel{
	public void run() {
		System.out.println("���� ������ �޸��ϴ�.");
	}
	public void jump() {
		System.out.println("���� Jump �մϴ�.");
	}
	public void turn() {
		System.out.println("Turn �մϴ�.");
	}
	public void showLevelMessage() {
		System.out.println("***����� �����Դϴ�.***");
	}
}
