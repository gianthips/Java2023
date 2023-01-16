package chap08_objectarray.section01.init;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 500);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		Car[] carArray = new Car[5];
		
		for(int i = 0; i<carArray.length; i++) {
			System.out.println("CarArray["+i+"]:"+carArray[i]);
		}
		
//		carArray[0].driveMaxSpeed(); //null point exception이 발생할 것. 객체배열에서 가장 많이 발생하는 실수
		
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포터", 500);//반복문으로 할 수 없음.
//		carArray[5] = new Car("해리포터", 1000); // out-of-bound exception
		
		for(int i = 0; i<carArray.length; i++) {
			carArray[i].driveMaxSpeed();
		}
		
		Car[] carArray2 = {new Car("페라리", 300), 
				new Car("람보르기니", 350), 
				new Car("롤스로이스", 250), 
				new Car("부가티베이론", 400), 
				new Car("포터", 500)};
		
		for(Car c : carArray2) {
			c.driveMaxSpeed();
		}
		

	}

}
