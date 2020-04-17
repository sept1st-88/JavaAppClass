/*
 * 
*/
public class ArrayEx10_2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다차원 배열
//		2차원 배열
		int[][] scoreArr = new int[3][3];
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				scoreArr[i][n] = (i + 1) * 10;
			}
		}
		
		scoreArr[2][2] = 100;
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				System.out.print(scoreArr[i][n] + ", ");
			}
			System.out.println();
		}
		
		System.out.println(scoreArr[2][2]);
		

	} //main

}
