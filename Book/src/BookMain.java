
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookVo book = new BookVo();
		
		book.setTitle("박상아의 자서전");
		book.setAuthor("박상아");
		book.setPublisher("상아네 출판사");
		book.setPrice(20000);
		book.setDate("2010년 03월 05일");
		
		System.out.println(book);
//		
//		System.out.println("제목: " + book.getTitle());
//		System.out.println("지은이: " + book.getAuthor());
//		System.out.println("출판사: " + book.getPublisher());
//		System.out.println("가격: " + book.getPrice());
//		System.out.println("출판 날짜: " + book.getDate());

	}

}
