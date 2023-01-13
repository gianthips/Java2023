package chap07_singleton;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		
//		싱글톤 패턴
//		- 애플리케이션이 하나 시작 될 때 어떤 클래스가 최초 한 번만 메로리에 할당하고, 그 메모리에 인스턴스를 만들어서
//		- 하나의 인스턴스를 공유하여 사용하여 메모리 낭비를 ㅂ아지할 수 있게 함(매번 인스턴스를 생성하지 않음)
//		장점
//		1. 첫번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않음
//		두번째 이용 시에는 인스턴스 생성 시간이 필요 없기 때문에 빠르다
//		2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보장할 수 없다.
//		
//		단점
//		1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다 유지보수성이 떨어짐
//		2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
//		
//		싱글톤 구현 방법
//		1. 이른 초기화
//		2. 게으른 초기화
		
//		EagerSingleton eager1 = new EagerSingleton();
		
		EagerSingleton eager1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();
		
		System.out.println("eager1 hashcode : " + eager1.hashCode());
		System.out.println("eager2 hashcode : " + eager2.hashCode());

	}

}
