/*
 * 국영수 3과목에 대해 5명의 성적이 있다
 * 각 총점과 평균을 구하고
 * 가장 높은 학생의 번호를 출력하시오
 * =============================
 * 번호 국어 영어 수학
 * 1 100 100 100
 * 2 20 20 20
 * 3 30 30 30
 * 4 40 40 40
 * 5 50 50 50
 * 
 * 수석 학생
 * 총점: 300
 * 평균: 100.0 (소수점 첫째 자리만 표현 둘째 자리는 버린다)
 * 
*/
public class ArrayTest8_2차원배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scoreArr = new int[5][3];
		
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr[0].length; n++) {
				scoreArr[i][n] = i;
			}
		}
		
		int sum = 0;
		int[] sumArr = new int[5];
		
		System.out.println("번호\t국어\t영어\t수학");
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print((i + 1) + "\t");
			for (int n = 0; n < scoreArr[0].length; n++) {
				scoreArr[0][n] = 100;
				scoreArr[1][n] = 20;
				scoreArr[2][n] = 30;
				scoreArr[3][n] = 40;
				scoreArr[4][n] = 50;
				System.out.print(scoreArr[i][n] + "\t");
			}
			sum = scoreArr[i][0] + scoreArr[i][1] + scoreArr[i][2];
			System.out.println("총: " + sum);
		}

	}

}
