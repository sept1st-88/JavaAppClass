import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요.");
		
		int score = 0;
		String grade = "";
		
		score = scan.nextInt();
		
		System.out.println("당신의 점수는 " + score);
		
//		중첩 if문
		
//		if(score >= 90) {
//			grade = "A";
//			if(score >= 98) {
//				grade += "+";
//			}
//		} else if(score >= 80) {
//			grade = "B";
//			if(score >= 88) {
//				grade += "+";
//			} else if(score < 84) {
//				grade = grade + "-";
//			}
//		} else if(score >= 70) {
//			grade = "C";
//			if(score >= 78) {
//				grade += "+";
//			} else if(score < 74) {
//				grade = grade + "-";
//			}
//		} else {
//			grade = "F";
//		}
		
		
//		하지만 아래 와 같이 주로 작성 (same thing)
		if(score >= 98) {
			grade = "A+";
		} else if(score >= 90) {
			grade = "A";
		} else if(score >= 88) {
			grade = "B+";
		} else if(score >= 83) {
			grade = "B-";
		}
		
		System.out.println("학점은 " + grade + "입니다.");

	}

}
