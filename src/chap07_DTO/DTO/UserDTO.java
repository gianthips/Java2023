package chap07_DTO.DTO;

public class UserDTO {
	
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;
	
	public UserDTO() {}
	
	public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
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
	
	public void setEnrollDate(java.util.Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public java.util.Date getEnrollDate(){ // 이렇게 하는거구나
		return enrollDate;
	}
	
	public String getInformation() {
		return "UserDTO [id=" + this.id 
				+ ", pwd=" + this.pwd 
				+ ", name=" + this.name 
				+ ", enrollDate=" + this.enrollDate 
				+ "]";
	}

}
