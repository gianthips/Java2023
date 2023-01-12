package chap07_object.teamstudy;
import java.util.Scanner;

import chap07_object.abstraction.CarRacer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master ssadda = new Master();
		while(true) {
			System.out.println("====싸다김밥 프로그램====");
			System.out.println("1. 손님 맞이");
			System.out.println("2. 주문 받고 계산해주기");
			System.out.println("3. 김밥 만들기");
			System.out.println("4. 김밥 전달하고, 손님의 반응을 듣기");
			System.out.print("9. 프로그램 종료");
			System.out.print("");
			
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			
			switch(no) {    
				case 1: 
					ssadda.menuNotice(); 
					break;
				case 2: 
//					System.out.println("주문하려는 김밥은 몇 종류 입니까?");
					ssadda.orderTotalSpecies();
//					System.out.println("주문하려는 김밥의 번호를 하나씩 말씀해주세요.");
					ssadda.orderSpecies();
//					System.out.println("주문하려는 김밥의 각 종류별 갯수를 말씀해주세요.");
					ssadda.orderAmount(); //입출력 관계를 잘 모르겠구만.
					ssadda.calculator();
//					System.out.println("전체금액은 " + ssadda.calculator()+"입니다.");
					ssadda.ordercomp();
		
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
			}
			
		}
	}

}
