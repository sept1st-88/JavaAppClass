
public class ArrayEx9_초기값유지_숫자섞기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArr = new int[5];
		int[] newNumArr = new int[5];
		
		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = i + 1;
		}
		
		//우선 numberArr의 숫자들을 shuffleArr에 넣어준다 (섞은 후에 numberArr값들은 변함이 없게 만들기 위해 **원본유지)
//		newNumArr = numberArr;	//이렇게하면 둘중에 하나를 바꾸면 둘다 바꿔버리기 때문에 아래 처럼 하나씩 값을 지정해 주어야한다.
		newNumArr[0] = numberArr[0];
		newNumArr[1] = numberArr[1];
		newNumArr[2] = numberArr[2];
		newNumArr[3] = numberArr[3];
		newNumArr[4] = numberArr[4];
		
		System.out.println("numberArr 출력 " );
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		
		System.out.println();
		System.out.println("원본은 지켜야한다");
		System.out.println();
		
		System.out.println("newNumArr 출력" );
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
		
		newNumArr[0] = 10;			//각각 다른 값을 지정해주면 서로 영향을 미치지 않는다
		numberArr[3] = 23123;
		
		System.out.println("numberArr 출력 " );
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		
		System.out.println("newNumArr 출력" );
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}

	}

}
