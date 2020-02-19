/**
 * 
 * @author TJ
 * 구구단 만들기
 * 2차원 배열
 * 결과만 2차원 배열에 넣는다
 * 그걸 출력한다.
 * 
 */
public class GugudanVer2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//가로 
//		int[][] mulNumArr = new int[8][9];
		
//		for (int i = 0; i < mulNumArr.length; i++) {
//			for (int j = 0; j < mulNumArr[0].length; j++) {
//				mulNumArr[i][j] = (i + 2) * (j + 1);
//				System.out.print((i + 2) + " * " + (j + 1) + " = " + mulNumArr[i][j] + " \t ");
//			}
//			System.out.println();
//		}
		
		//세로 
		int[][] mulNumArr = new int[9][8];
		
		for (int i = 0; i < mulNumArr.length; i++) {
			for (int j = 0; j < mulNumArr[0].length; j++) {
				mulNumArr[i][j] = (j + 2) * (i + 1);
				System.out.print((j + 2) + " * " + (i + 1) + " = " + mulNumArr[i][j] + " \t ");
			}
			System.out.println();
		}
		
//		mulNumArr[0][0] = 
		
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				mulNumArr[i][j] = ;
//				System.out.println(mulNumArr);
//			}
//		}
		
//		2 * 1 = mulNumArr[0][0] 2 * 2 = 4
//		3 * 1 = 3 3 * 2 = 6  ,,,,,,,   3 * 9 = 27		
//		,
//		,
//		,
//		9 * 1 = 9 9 * 2 = 18 ,,,,,,    9 * 9 = mulNumArr[?][?]

	}

}
