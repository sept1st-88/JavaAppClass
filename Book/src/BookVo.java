
public class BookVo {

	private String title = "";	//제목
	private String author = "";	//지은이
	private String publisher = "";	//출판사
	private int price = 0;	//가격
	private String date = "";	//출판날짜
	
	// Alt + Shift + S  > Generate Constructors from Superclass
	public BookVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	//	Alt + Shift + S + Generate Constructor using fields
	public BookVo(String title, String author, 
			String publisher, int price, String date) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.date = date;
	}
	
	//	Alt + Shift + S  > Generate getters and setters 
	//  (get이 먼저 그다음에 set)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + 
				", publisher=" + publisher + ", price=" + price
				+ ", date=" + date + "]";
	}
	
	//묵시적
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	
	
}
