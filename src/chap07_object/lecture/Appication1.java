package chap07_object.lecture;

public class Appication1 {
	public static void main(String[] args) {
		//배열은 한가지 자료형만을 묶을 수 있어서 한계점을 가지고 있음.
		//회원 정보 관리: 아이디, 비밀번호, 이름, 나이, 성별, 취미
		//
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
//		String[] hobby = new String[] {"축구","볼링","테니스"};
		String[] hobby = new String[] {"축구","볼링","테니스"};
		
		
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(hobby);
		for(int i=0; i<hobby.length; i++) {
			System.out.print(hobby[i] + "");
		}
		System.out.println();
		
//		사용자 정의의 자료형 사용
//		클래스 사용할 이름 = new 클래스();
//		자료형 변수명 = new 클래스명();
		
		Member member = new Member(); //Member 타입의 객체를 보관할 수 있는 member라는 공간. new라는 할당 연산자를 통해서 6개의 공간 나열
		//id pwd name age gender hobby
		//이렇게 공간이 만들어지고 나서 발생한 주소값을 member에 저장. 찾아갈 때는 member.id 여기에서 . 은 member의 주소로 간다.
		//jvm이 설정한 값으로 공간은 채워져 있을 것임.
		//근데 요거는 어쨌든 member.java에 있음
		
		System.out.println(member.id);//null 프린트
		System.out.println(member.gender);//빈칸으로 프린트
		System.out.println(member.hobby);//빈칸으로 프린트
		
		member.id = "홍길동";
		member.gender = '남';//char형 주의
		member.hobby = new String[] {"축구", "볼링", "테니스"}; //String으로 입력 주의
		System.out.println(member.id);//
		System.out.println(member.gender);//
		System.out.println(member.hobby);//
		System.out.println(member.hobby[0]);//
		System.out.println(member.hobby[1]);//
		System.out.println(member.hobby[2]);//
		System.out.println(member);//골뱅이 앞에 있는게 자료형, 뒤에 있는게 주소
		System.out.println(member.hashCode());//
		
		//코드가 변경에 취약한가? 
		
	}

}
