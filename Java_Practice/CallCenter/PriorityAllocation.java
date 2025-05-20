package CallCenter;

public class PriorityAllocation implements Scheduler {
	
	public void getNextCall() {
		System.out.println("상담 전화 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("우선순위가 높은 고객에 먼저 할당합니다.");
	}
}
