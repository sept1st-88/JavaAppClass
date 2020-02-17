/*
 * 
 * 1부터 10까지 더 하는 프로그램을 작성하시오
 * 
 * ================================
 * 1부터 10까지의 합:55
 * for문
*/
public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int total = 0;
		 * 
		 * for(int i = 1; i <= 10; i++) { total = total + i; }
		 * 
		 * System.out.println("1부터 10까지의 합: " + total);
		 */
		
//		누적
//		1~10까지의 합
		int sum = 0;
		int cnt = 1;
		
//		sum = sum + cnt;
//		cnt++;
//		sum = sum + cnt;
//		cnt++;
//		sum = sum + cnt;
//		.
//		.
//		.
		
//		몇번? 횟수
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "번째\t" + sum + " + " + i + " = ");	//과정을 보여준다
//			결과에 대한 자신 = 결과에 대한 자신 + 대상
			sum = sum + i;
//			sum += i;
			System.out.println(sum);	//과정을 보여준다
		}
		
		System.out.println("총합: " + sum);	//결과만 보여준다

	}

}
