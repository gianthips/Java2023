package chap07_final;

public class FinalFieldTest {

//	private final int nonStaticNum; 처음에 인스턴스를 생성할 때 int 형이니까 0으로 초기화. 0으로 초기화 되어 이후 변경 불가능
	
	/*1.선언과 동시에 초기화를 한다.*/
	
	private final int NON_STATIC_NUM = 1; //final 키워드가 붙은 변수 카멜식으로 쓰지 않는다.
//	nonStaticNum = 1;
	
	/*2. 생성자를 이용해서 초기화 */
	private final String NON_STATIC_NAME;
	
	public FinalFieldTest(String name) {
		this.NON_STATIC_NAME = name;
	}
	
	/* final은 static과 조합해서 사용할 수 있다.*/
	/* static은 jvm이 정한 초기값으로 초기화 되기 때문에 final 키워드 사용 시 명시적 초기값을 작성해야 한다.*/
//	private static final int STATIC_NUM; 이렇게 선언만으로는 사용할 수 없다. 명시적으로 초기화를 해줘야 한다.
	private static final int STATIC_NUM = 1;
	
//	/*생성자로 초기화 불가*/
	private static final double STATIC_DOUBLE;
//	
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;}
//	}
	
	/*정적 초기화 블럭을 이용하느느 경우는 가능*/
	static {
		STATIC_DOUBLE = 5.0;	
	}	
}
