package chap04.lecture.flowcontrolstatement;
import java.util.Scanner;

public class C_ifElseIf {
	
	public void testSimpleIfElseIfStatement() {
		
		/* [if-else-if문 표현식]
		 * if(조건식1) {
		 *     조건식1이 true일 때 실행할 명령문;
		 * } else if(조건식2) {
		 *     조건식1이 false이고 조건식2가 true일 때 실행할 명령문;
		 * } else {
		 *     조건식1과 조건식2가 둘 다 false일 때 실행할 명령문;
		 * }
		 * */
		
//		String str1 = "java";
//		String str2 = "java";
//		
//		System.out.println(str1 == str2);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력하세요 : ");
//		String str3 = sc.nextLine();
//		System.out.println(str3);
//		System.out.println(str1 == str3);
//		System.out.println(str1.equals(str3));
		
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
		
		System.out.print("어느 도끼가 너의 도끼이냐? : ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		
		if(answer.equals("금도끼")) {
			System.out.println("이런 거짓말쟁이!! 너에게는 아무 도끼도 줄 수 없구나 이 욕심쟁이야!!");
		} else if(answer.equals("은도끼")) {
			System.out.println("욕심이 과하지는 않지만 그래도 넌 나에게 거짓말을 하고있구나!! 어서 썩 사라지거라!!");
		} else {
			System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
		}
		
		System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다..");
	}
}

