package chap07_static;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticFieldTest sft1 = new StaticFieldTest();
		
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());

		sft1.increaseNonStaticCount();
		sft1.increasStaticCount();
		
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());

		StaticFieldTest sft2 = new StaticFieldTest();

		System.out.println("non-static field : " + sft2.getNonStaticCount());
		System.out.println("static field : " + sft2.getStaticCount()); //static은 값을 계속 가지고 있음. 생성자 좆까고.
		
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		StaticMethodTest.staticMethod(); //인스턴스 생성 없이 호출해야 함. 
//		smt.staticMethod(); 굳이 인스턴스를 생성하여 접근 가능하긴 하다. 그러나 권장하지는 않음.
		
//		Math.PI public static final double임
//		Math.abs(-1); 메소드만 호출해서 사용하라는 의미.
	}

}
