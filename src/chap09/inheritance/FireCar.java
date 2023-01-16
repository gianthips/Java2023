package chap09.inheritance;

public class FireCar extends Car {
	
	
	@Override
	public void soundHorn() {
		if(isRunning) {
			System.out.println("바아아앙~빠앙아!!");
		}
		else {
			System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요.");
		}
	}
	public void sprayWater() {
		System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.========>");
	}
}
