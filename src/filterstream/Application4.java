package filterstream;

import filterstream.dto.MemberDTO;

public class Application4 {
	public static void main(String[] args) {
		/* 객체 단위로 입출력을 하기 위한 보조스트림
		 * ObjectInputStream/ObjectOutputStream
		 * */
		MemberDTO[] outputMembers = {
				new MemberDTO("user01", "pass01", "홍길동", "hong123@gmail.com", 25, '남', 1250.7),
				new MemberDTO("user02", "pass01", "홍길동", "hong123@gmail.com", 25, '남', 1250.7),
				new MemberDTO("user03", "pass01", "홍길동", "hong123@gmail.com", 25, '남', 1250.7),
		};
		
	}

}
