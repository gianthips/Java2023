package chap07_static;

public class StaticFieldTest {
	/*
	 * 필드 작성 위치
	 * 
	 * 1. non-static field
	 * 2. static field
	 * 
	 */
	
	private int nonStaticCount;
	private static int staticCount; //static 키워드는 자료형 앞에 붙는다.
	
	public StaticFieldTest() {}
	
	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	
	public int getStaticCount() {
//		return StaticFieldTest.staticCount; //클래스명.필드
		return staticCount; //같은 클래스에 있어서 필드명 생략가능
	}
	
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	
	public void increasStaticCount() {
		StaticFieldTest.staticCount++;
	}
	
	
	
}
