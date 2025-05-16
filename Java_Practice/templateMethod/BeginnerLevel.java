package templateMethod;

public class BeginnerLevel extends PlayerLevel{
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump() {
		System.out.println("Jump 할 줄 몰라요.");
	}
	public void turn() {
		System.out.println("Turn 할 줄 몰라요.");
	}
	public void showLevelMessage() {
		System.out.println("***초보자 레벨입니다.***");
	}
}
