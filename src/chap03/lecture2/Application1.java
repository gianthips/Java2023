package chap03.lecture2;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. non-static 메소드 호출*/
		chap03.lecture.Calculator calc = new chap03.lecture.Calculator();
		int min = calc.minNumberOf(30,20);

		System.out.println("30과 20 중 더 작은 값은?" + min);
		

	}

}
