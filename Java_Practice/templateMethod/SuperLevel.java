package templateMethod;

public class SuperLevel extends PlayerLevel{
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
	}
	public void jump() {
		System.out.println("높게 Jump 합니다.");
	}
	public void turn() {
		System.out.println("Turn 합니다.");
	}
	public void showLevelMessage() {
		System.out.println("***고급자 레벨입니다.***");
	}
}
