package chap07_DTO.constructor;

public class User {
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;

	/* 생성자 작성 위치 *
	 * 작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만
	 * 통상적으로는 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례임.
	 * /
	/* 생성자 작성 방법
	 * [표현식]
	 * 접근제한자 클래스명([매개변수]){
	 * 인스턴스 생성 시점에 수행할 명령을 기술(주로 필드를 초기화)
	 * this.필드명 = 매개변수; //설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있따.
	 * }
	 *
	 *주의사항
	 *1. 생성자 메소드는 반드시 클래스 이름과 동일하게 작성해야 한다.(대/소문자까지 같아야 함)
	 *2. 생성자 메소드는 반환형을 작성하지 않는다.(작성하게 되면 생성자가 아닌 메소드로 인식한다.)
	 *
	 */
	
//	생성자의 사용 목적
//	1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용
//	2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드값을 초기화하여 인스턴스를 생성할 목적으로 주로 사용한다
//	3. 인스턴스 생성 시 초기값 전달을 강제화 하기 위해 사용한다.
	
//	기본생성자(default constructor)
//	: 컴파일러가 자동으로 추가해주는 구문
//	근데 조건부로 작성해준다.
//	매개변수가 있는 생성자가 한 개라도 존재하는 경우 기본 생성자는 자동으로 추가되지 않는다.
	
	public User() {	//생성자 이름은 클래스와 동일해야 한다. 그리고 여기에서 void를 붙인다던가. 그러면 일반 메소드라고 생각해서 안된다. public void User로 하면 메소드다.
		System.out.println("User 클래스의 기본생성자를 호출함...");
	}
	
	
	/*매개변수 있는 생성자*/
	public User(String id, String pwd, String name) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자를 호출함");
			
	}
	
	public String getInformation() {
		return "User [id =" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate; 
	}
}
