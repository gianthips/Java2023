package chap07_object.question.level02_01;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDTO bd1 = new BookDTO();
		System.out.println(bd1.printInformation());
		
		BookDTO bd2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
		System.out.println(bd2.printInformation());
		
		BookDTO bd3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
		System.out.println(bd3.printInformation());
	}

}
