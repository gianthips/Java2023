package chap07_object.question.level02_01;

public class BookDTO {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public BookDTO() {	
		
	}	
	public BookDTO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public BookDTO(String title, String publisher, String author, int Price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;		
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;		
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public String printInformation() {
		return this.title +", "+ this.publisher +", "+ this.author +", "+ this.price +", "+ this.discountRate; 
	}
	
}
