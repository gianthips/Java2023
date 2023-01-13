package chap07_initblock;

public class Product {
	
	private String name; // name = "갤럭시" 이렇게 하면 더 센 초기화임
	private int price;
	private static String brand;
	
	//인스턴스 초기화 블럭. 인스턴스가 생성되는 시점에 초기화가 됨.
	{
		name = "사이언";
		price = 900000;
		brand = "헬지";		
		System.out.println("인스턴스 초기화 블럭 동작함...");
	}
	
	
	static { //최초에 프로그램이 만들어질 때 동작. Application의 메인메소드. 이때 선언이 된다. 그러니 이렇게 하면 빨간글씨가 뜰 것.
//		name = "아이뽕";
//		price = 1500000;
//		brand = "사과"; 얘는 괜찮겠지. 앞에 static이니까
		brand = "사과";
		System.out.println("정적 초기화 블럭 동작함...");
	}
	
	public Product() {
		System.out.println("기본 생성자 호출함...");
	}
	
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		Product.brand = brand;
		
		System.out.println("매개변수 있는 생성자 호출됨...");
	}
	
	public String getInformation() {
		return "Product [name =" + this.name + ",price=" + this.price + ", brand=" + Product.brand + "]";
	}
}
