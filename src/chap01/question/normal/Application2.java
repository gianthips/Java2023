package chap01.question.normal;

public class Application2 {

	public static void main(String[] args) {
		double guk = 80.5;
		double su = 50.6;
		double yan = 70.8;
		int chong;
		int aver;
		int gwa;
		gwa = 3;
		chong = (int)(guk+su+yan);
		aver = (int)((guk+su+yan)/gwa);
		System.out.println("총점 : "+(chong));
		System.out.println("평균 : "+(aver));
		/* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
		 * 총점과 평균을 정수 형태로 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 총점 : 201
		 * 평균 : 67
		 *  */
		
	}

}
