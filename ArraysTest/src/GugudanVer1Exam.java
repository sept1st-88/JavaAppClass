/**
 * 
 * @author TJ
 * 구구단 만들기
 * 1차원 배열
 * 결과만 1차원 배열에 넣는다
 * 그걸 출력한다.
 * 
 */
public class GugudanVer1Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mulNumArr = new int[72];
		int count = 0;
		
		//가로 
//		for (int i = 0; i < 8; i++) {
//			for (int j = 1; j < 10 ; j++) {
//				mulNumArr[count] = (i + 2) * j;
//				System.out.print((i + 2) + " * " + j + " = " + mulNumArr[count] + "\t");
//				count++;
//			}
//			System.out.println();
//		}
		
		//세로 
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 8 ; j++) {
				mulNumArr[count] = (j + 2) * i;
				System.out.print((j + 2) + " * " + i + " = " + mulNumArr[count] + "\t");
				count++;
			}
			System.out.println();
		}
		
		//확인
		System.out.println();
		System.out.println("확인:");
		System.out.println(mulNumArr[3]);
		System.out.println(mulNumArr[71]);
		
		
		
		/*
		설명
		*/
		
//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10 ; j++) {
//				mulNumArr[i] = j * i;
//				System.out.print(j + " * " + i + " = " + mulNumArr[i] + "\t");
//			}
//			System.out.println();
//		}
		
//		2 + "*" + = (2 * i)
//		2 * 1 = mulNumArr[0] 3 * 1 = mulNumArr[1]  ,,, 	9 * 1 = mulNumArr[8]
//		2 * 2 = 4 3 * 2 = 6  ,,, 	9 * 2 = 18
//		2 * 3 = 6 3 * 3 = 9  ,,, 	9 * 3 = 27
//		
//		
//		2 * 9 = 18 3 * 9 = 27  ,,, 	9 * 9 = mulNumArr[??]

	}

}
