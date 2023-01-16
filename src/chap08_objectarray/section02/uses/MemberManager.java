package chap08_objectarray.section02.uses;

public class MemberManager {
	
	public void signUpMembers() {
		
		MemberDTO[] members = new MemberDTO[5];
		
		members[0] = new MemberDTO(1, "user01", "pass01", "홍길동", 20, '남');
		members[1] = new MemberDTO(2, "user02", "pass02", "유관순", 16, '여');
		members[2] = new MemberDTO(3, "user03", "pass03", "이순신", 40, '남');
		members[3] = new MemberDTO(4, "user04", "pass04", "신사임당", 36, '여');
		members[4] = new MemberDTO(5, "user05", "pass05", "윤봉길", 22, '남');
		
		MemberInsertManager memberInsertManager = new MemberInsertManager();
		memberInsertManager.insert(members); // 여러개의 DTO값을 하나로 뭉쳐서 전달
	}
	
	public void printAllMembers() {
		
	}
	
}
