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
public class ArrayTest9_2차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scoreArr = new int[5][3];
		int[] sumArr = new int[5];
		int sum = 0;
		int max = 0;
		int posit = 0;
		double aver = 0.0;
		
		System.out.println("\t국어\t영어\t수학");
		//값넎는곳
		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 0) {
					scoreArr[i][j] = (i + 1) * 100;
				} else {
					scoreArr[i][j] = (i + 1) * 10;
				}
			}
		}
		//출력한다
		for (int i = 0; i < sumArr.length; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < 3; j++) {
				System.out.print(scoreArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//합계
		for (int i = 0; i < sumArr.length; i++) {
			sum = 0;
			for (int n = 0; n < 3; n++) {
				sum = sum + scoreArr[i][n];
			}
			sumArr[i] = sum;
//			System.out.println(sum);
		}
		//제일 높은 합계를 출력한다
		for (int i = 0; i < sumArr.length - 1; i++) {
			if(sumArr[i] > sumArr[i + 1]) {
				max = sumArr[i];
				System.out.println("총점: " + max);
			}
		}
		
		//평균
		aver = (int)((double)max / 3 * 10) / 10.0;
		
		System.out.println("평균: " + aver);

	}

}
