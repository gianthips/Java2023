package filterstream.dto;

public class MemberDTO {
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	private char gender;
	private double point;
	
	public MemberDTO() {
				
	}

	public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getPoint() {
		return point;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPoint(double point) {
		this.point = point;
	}
}
