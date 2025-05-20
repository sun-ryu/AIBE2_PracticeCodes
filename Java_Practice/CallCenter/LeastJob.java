package CallCenter;

public class LeastJob implements Scheduler {
	
	public void getNextCall() {
		System.out.println("상담 전화 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("쉬고 있거나 대기가 가장 상담원에게 배분합니다.");
	}
}
