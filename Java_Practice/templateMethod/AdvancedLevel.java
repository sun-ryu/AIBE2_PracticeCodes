package templateMethod;

public class AdvancedLevel extends PlayerLevel{
	public void run() {
		System.out.println("빠르게 달립니다.");
	}
	public void jump() {
		System.out.println("Jump 합니다.");
	}
	public void turn() {
		System.out.println("Turn 할 줄 몰라요.");
	}
	public void showLevelMessage() {
		System.out.println("***중급자 레벨입니다.***");
	}
}
