import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * 100 ~ 90점 이상이면 A학점
 * 90점 미만 80점 이상이면 B학점
 * 79점이하 70점 이상이면 C학점
 * 그외는 F학점
 * 
 * if문 사용
 * 사용자 입력을 점수로 받는다
 * 
 * =====================
 * 당신의 점수는 ...
 * 학점은 ...입니다.
 * 
 */
public class FlowTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요:");
		score = scan.nextInt();
		
		System.out.println("당신의 점수는 " + score);
		
//		if(score >= 90) {
//			System.out.println("학점은 A입니다.");
//		}else if(score >= 80) {
//			System.out.println("학점은 B입니다.");
//		}else if(score >= 70) {
//			System.out.println("학점은 C입니다.");
//		}else {
//			System.out.println("학점은 F입니다.");
//		}
		
		String grade = "";
		
		if(score >= 90 && score <= 100) {		//하지만 이것은 위에 것과 동일하게 출력된다. 그러므로 위에 형식으로 작업하는 것이 속도상 더 좋다.
			grade = "A";
		}else if(score >= 80 && score < 90) {
			grade = "B";
		}else if(score >= 70 && score <= 79) {
			grade = "C";
		}else if(score >= 0 && score < 70) {
			grade = "F";
		}else {
			System.out.println("유효하지 않습니다. 다시 입력해주세요.");
			grade = "_";
		}
		
		System.out.println("학점은 " + grade + "입니다.");

	}

}
