
/* (실행하고 싶은 프로그램 설명은 이렇게 클래스 위에다 작성해준다.)
 * 60점이상이면 합격입니다
 * 60점 미만이면 불합격입니다 라고 출력하는 프로그램
 * ====================================
 * 점수: 75
 * 합격입니다
 * or
 * 점수: 59
 * 불합격입니다
 */
public class FlowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int scoreNum = 0;
		
		scoreNum = 75;
		
		if(scoreNum >= 60) {
			System.out.println("점수: " + scoreNum);
			System.out.println();
			System.out.println("합격입니다");
		}
		
		if(scoreNum < 60) {
			System.out.println("점수: " + scoreNum + "\n불합격입니다");		// \n은 웬만해선 잘 안쓰는게 좋고 위에 처럼 새줄로 출력하는게 좋다. (결과 출력이 다르므로 구분을 시켜준다)
		}
		
		
//		또다른 방법
		
//		System.out.println("점수: " + scoreNum);
//		
//		if(scoreNum >= 60) {
//			System.out.println("합격입니다");
//		}
//		
//		if(scoreNum < 60) {
//			System.out.println("불합격입니다");
//		}

	}

}
