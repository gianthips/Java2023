package chap01.question.team;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 길이가 10.97, 15,67인 삼각형의 넓이를 구하고 정수단위까지 넓이를 구하여라 상수 98이 나타내는 유니코드를 구하여라.ㅣ
		 */
		double a = 10.97, b = 15.67;
		double area = (a * b)/2;
		int c = (int) area;
		System.out.println("삼각형의 넓이 : " + area);
		System.out.println("삼각형의 넓이의 정수꼴 " + c);
		
		int d = 98;
		char e = (char)d;
		System.out.println("상수 98이 나타내는 유니코드 : " + e);
	}

}
