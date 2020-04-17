/*
 * 1부터 5까지 숫자가 들어있는 배열을 만들고
 * 순차적으로 출력하시오
 * ===================
 * 배열[0] = 1
 * 배열[1] = 2
 * 배열[2] = 3
 * 배열[3] = 4
 * 배열[4] = 5
*/
public class ArrayTest1_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = null;
		arr = new int[5];
		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		//배열을 쓴다는 것은 반복문을 쓰겠다는거다. 위의 배열의 변수값을 지정해주는것을 for문으로 한다.
		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("배열[0]" + " = " + arr[0]);
		System.out.println("배열[1]" + " = " + arr[1]);
		System.out.println("배열[2]" + " = " + arr[2]);
		System.out.println("배열[3]" + " = " + arr[3]);
		System.out.println("배열[4]" + " = " + arr[4]);
		
		System.out.println("======for문======");
		
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("배열[" + count + "] = " + arr[i]);
			count++;
		}
		
		System.out.println("======while문======");
		
		int n = 0;
		int count2 = 0;
		
		while(n < 5) {
			System.out.println("배열[" + count2 + "] = " + arr[n]);
			count2++;
			n++;
		}

	}

}
