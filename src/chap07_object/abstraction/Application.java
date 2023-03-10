package chap07_object.abstraction;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		/* 객체지향 프로그래밍(Object Oriented Programming - oop)
		 * 프로그램을 만들 때 현실 세계를 표방하여 새로운 세계를 창조하는 방법론이다.
		 * 낮은 결합도와 높은 응집도를 추구함. 
		 * 모든 객체는 책임을 가지고 자신의 역할을 수행한다.
		 * 또한 하나의 객체는 너무 많은 일을 수행하는 것이 아니라 적절한(1개의) 책임을 가지고 있어야 한다. (단일 책임의 원칙)
		 */
//		
//		카레이서가 자동차를 운전하는 프로그램
//		요구사항
//		1. 자동차는 처음 멈춘 상태로 대기하고 있다.
//		2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다.
//		3. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h씩 증가하며 앞으로 나간다.
//		4. 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 즉시 0으로 떨어지며 멈춘다.
//		5. ㅂ브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.
//		6. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 못한다.
//		7. 자동차가 달리는 중이라면 시동을 끌 수 없다.
//		
		
//		객체 구분
//		1. 자동차
//		2. 카레이서
//		
//		자동차가 수신할 수 있는 메세지
//		1. 시동을 걸어라
//		2. 앞으로 가라
//		3. 멈춰라
//		4. 시동을 꺼라
		
//		카레이서가 수신할 수 있는 메세지
//		1. 시동을 걸어라
//		2. 엑셀레이터를 밟아라
//		3. 브레이크를 밟아라
//		4. 시동을 꺼라
		
		CarRacer racer = new CarRacer();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====카레이싱 프로그램====");
			System.out.println("1. 시동 걸기");
			System.out.println("2. 전진");
			System.out.println("3. 정지");
			System.out.println("4. 시동 끄기");
			System.out.print("9. 프로그램 종료");
			int no = sc.nextInt();
			
			switch(no) {    
				case 1: racer.startUp(); break;
				case 2: racer.stepAccelator(); break;
				case 3: racer.stepBreak(); break;
				case 4: racer.turnOff(); break;
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
			}
			
		}
		
	}

}
