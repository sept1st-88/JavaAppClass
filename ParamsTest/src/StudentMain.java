
public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동", 2, 1, 100, 60, 76);
		
		student.getTotal();
		student.getAverage();

		System.out.println("이름: " + student.name + " / " + "반: " + student.ban + " / " + "번호: " + student.no);
		System.out.println("국어: " + student.kor + " / " + "영어: " + student.eng + " / " + "수학: " + student.math);
		System.out.println("총점: " + student.getTotal());
		System.out.println("평균: " + student.getAverage());
		
	}
	
}
