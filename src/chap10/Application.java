package chap10;

public class Application{
	public static void main(String[] args) {
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		gt1.setValue(1);
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		GenericTest<String> gt2 = new GenericTest<>();
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
	}
}
