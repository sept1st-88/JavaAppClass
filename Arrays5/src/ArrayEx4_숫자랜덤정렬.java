
public class ArrayEx4_숫자랜덤정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		정렬된 숫자를 랜덤하게 섞는 프로그램
		
		int[] numberArr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			numberArr[i] = i;	//배열의 값들을 인덱스 값과 같게 만들고 싶을떄
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(numberArr[i] + "  ");
		}
		System.out.println();
		
		int rndIndex = 0;
		int tempNum = 0;
		
		for (int i = 0; i < 10; i++) {
			rndIndex = (int)(Math.random() * 10);		//(Math.random() * 10)에서 "* 10"은 랜덤으로 출력할 수의 범위다. 
														//즉 0~9 중에서만 출력.
			tempNum = numberArr[0];					//치환(exchange) 1. 임의로 인덱스0 값을 임의값에 저장한다
			numberArr[0] = numberArr[rndIndex];		//2. 인덱스0 값에 새로운 (랜덤)값을 지정해준다
			numberArr[rndIndex] = tempNum;			//3. (랜덤)값에 임의로 빼두었던 인덱스0의 값을 지정한다. 반복한다.
		}
		
		for (int i = 0; i < 10; i++) {
			if(i == 9) {
				System.out.print(numberArr[i]);
				break;
			}
			System.out.print(numberArr[i] + ", ");
		}
	}

}
