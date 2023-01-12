package chap07_DTO;

public class MemberDTO {
	
	private int number;
	private String name;
	private int age;
	private char gender;
	private double height, weight;
	private boolean isActivated;
	
	
	/*생성자*/
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		
//		if(height>0) {
//			this.height = height;
//		}else {
//			throw new Exception();
//		}

		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated; //boolean의 형의 경우 is는 생략하고 작성한다.
	}
	
	/*접근자*/
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	/* boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적인 관례이다.
	 * is로 시작하는 경우 필드의 is는 생략한다.
	 * 문법상 has가 적합한 경우 has를 사용할 수 있다.
	 */
	
	public boolean isActivated() {
		return isActivated;
	}
	
	
}
