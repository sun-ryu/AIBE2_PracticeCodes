package collection.arraylist;

import collection.Member;

public class MemverArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 회원 인스턴스 생성
		Member memberYoon = new Member(1001, "윤해강");
		Member memberLee = new Member(1002, "이용태");
		Member memberHan = new Member(1003, "한세윤");
		Member memberSol = new Member(1004, "이한솔");
		
		// ArrayList에 회원 추가
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHan);
		memberArrayList.addMember(memberSol);
		
		memberArrayList.showAllMember();
		
		// ArrayList에서 회원 삭제
		memberArrayList.removeMember(memberYoon.getMemberId());
		memberArrayList.showAllMember();
		
		// ArrayList에서 회원 특정 위치에 추가
		memberArrayList.insertMember(memberYoon, 0);
		memberArrayList.showAllMember();
	}

}
