import java.util.Scanner;

/*
 * 사용자의 숫자를 입력 받는다
 * 
 * 순서는 국어, 영어, 수학이다.
 * 국영수 중에 점수가 제일 높은 순으로 출력해라.
 * 딘, 3과목의 점수는 배열 변수 하나에 담겨있다.
 * 
 * ex. 점수 입력 값: 100, 81, 93
 * =============================
 * ex. 점수 정렬한 값: 100, 93, 81
*/
public class ArrayTest5_숫자정렬Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] inputArr = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("국어, 영어, 수학 순서로 점수를 입력해주세요:");
//		System.out.println("국어 점수 : ");
//		inputArr[0] = scan.nextInt();
//		System.out.println("영어 점수 : ");
//		inputArr[1] = scan.nextInt();
//		System.out.println("수학 점수 : ");
//		inputArr[2] = scan.nextInt();
//		
//		System.out.println("점수 입력 값 : " + inputArr[0] + " " + inputArr[1] + " " + inputArr[2]);
//											//100				//81				//93
//		int tempNum = 0;
//		
//		for (int i = 0; i < 3; i++) {
//			for (int n = 0; n < 3; n++) {
//				if(inputArr[i] > inputArr[n]) {
//					tempNum = inputArr[i];
//					inputArr[i] = inputArr[n];
//					inputArr[n] = tempNum;
//				}
//			}
//			
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print(inputArr[i] + "\t");
//		}
		
		
		int cnt = 0;
		int[] numArr = new int[3];
		
//		numArr[0] = scan.nextInt();
//		numArr[1] = scan.nextInt();
//		numArr[2] = scan.nextInt();
		
		System.out.println("국어, 영어, 수학 순서로 점수를 입력해주세요:");
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = scan.nextInt();
		}
		
		System.out.println("배열의 길이 : " + numArr.length);
		
		System.out.println("정렬 전");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		
		//정렬하자
		//기본 정렬 (빨리 간단하게 구현):
		System.out.println();
		System.out.println();
		int tempNum = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < numArr.length; n++) {
				cnt++;
				System.out.println("횟수: " + cnt);
				System.out.println(numArr[i] + " : " + numArr[n]);
				if(numArr[i] > numArr[n]) {
					tempNum = numArr[i];
					numArr[i] = numArr[n];
					numArr[n] = tempNum;
				}
				//한번 수행하면 어떻게 될까?
				
				for (int j = 0; j < numArr.length; j++) {
					System.out.print(numArr[j] + "\t");
				}
				System.out.println();
				System.out.println("===================");
			}//내부 for end
		}//바깥 for end
		
		System.out.println();
		System.out.println("정렬 후");
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}

	}

}
