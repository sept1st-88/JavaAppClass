/*
 * 로또 번호 생성기
*/
// 배열
// 관련있는 것들의 묶음
public class ArrayEx8_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ballArr = new int[45];	//make an array of integers with 45 values
		
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;			//assign the values 1-45 순차적으로 to each variable
		}
		
		//숫자 배열을 나열해보자
		for (int i = 0; i < ballArr.length; i++) {
			System.out.print(ballArr[i] + " ");
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		
		int tempNum = 0;	//두 값을 바꾸는데 사용할 임시 변수
		int n = 0;			//임의의 값을 얻기 위한 인덱스
		
		for (int i = 0; i < ballArr.length; i++) {	//ballArr.length만큼의 횟수만큼 반복하겠다. 꼭 length를 사용하지 않더라도 충분히 섞어줄 만큼의 숫자로 지정해줘도 된다.
			n = (int)(Math.random() * 45);	//배열 범위 (0~44)의 값을 얻는다. This is to get a random index number.
			
			//뒤섞기
			tempNum = ballArr[0];
			ballArr[0] = ballArr[n];
			ballArr[n] = tempNum;
		}
		
		//섞인 것을 다 출력해보자
		for (int i = 0; i < ballArr.length; i++) {
			System.out.print(ballArr[i] + " ");
			if((i + 1) % 10 == 0) {	//10의 배수일때 줄바꿈해준다
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		
		//6개만 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + " ");
		}

	} //main

}
