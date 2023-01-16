package chap09.inheritance;

public class RacingCar extends Car{
	
	public RacingCar() {
		System.out.println("RacingCar 클래스의 기본생성자 호출됨...");
		
	}

	@Override
	public void run() {
		
		// car에 있는 private isRunning에 접근할 수 없어서. 계속 그대로 나옴.
		// 부모의 불필요한 메소드도 상속을 받아서 의도치 않는 결과가. 이럴 경우에는?
		// 그렇다고 앞부분 주석 처리할 수는 없잖아. 결합성이 강하니까.
		System.out.println("레이싱카가 전속력으로 질주합니다!!!!");
	}
	
	@Override
	public void stop() {
		System.out.println("레이싱카가 멈춥니다!!");
	}
	
//	@Override
//	public void soundHorn(){}
//	
//	@Override
//	public void stop() {
//		System.out.println("레이싱카가 멈춥니다!!");
//	}
}
