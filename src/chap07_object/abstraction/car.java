package chap07_object.abstraction;

public class car {

	private boolean isOn;//기본값은 false이다.
	//공유해야한다면 전역변수로 선언. 메소드에 넣지 말고.
	private int speed; //외부에서 속도 조절을 못하도록 private로 선언.
	
	public void startUp() {
		if(isOn) {System.out.println("이미 시동이 걸려있습니다.");
		}else {
			this.isOn = true;
			System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
		}
		isOn = true;
	}
	
	public void go() {
//		int speed = 0; 누적을 하기 위해서는 지역변수로 하면 안되고 전역변수로.
		if(isOn) {
			System.out.println("차가 앞으로 움직입니다.");
			speed += 10;
			System.out.println("현재 차의 시속은" + this.speed + "km/h 입니다.");
		}else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
		}
	}
	
	public void stop() {
		if(isOn) {
			if(speed>0) {
				speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
			}else {
				System.out.println("차는 이미 멈춰있습니다.");
			}
		}else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 걸어주세요.");
		}
	}
	
	public void turnOff() {
		if(isOn) {
			if(speed >0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");
			}else {
				isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요.")
			}			
		}else {
			System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.")
		}
	}
	
}
