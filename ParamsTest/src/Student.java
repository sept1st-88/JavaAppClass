
public class Student {
	
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	Student() {
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		int total = 0;
		
		total = kor + eng + math;
		
		return total;
	}
	
	double getAverage() {
		double total = 0;
		double avg = 0;
		double roundUp = 0;
		
		total = kor + eng + math;
		
		avg = (double)total / (double)3;
		roundUp = (int)(avg * 100 + 0.5) / 100.0;
		
		return roundUp;
	}

}
