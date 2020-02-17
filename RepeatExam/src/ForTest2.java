/*
 * 1부터 10까지 더 하는 프로그램을 작성하시오
 * 
 * ================================
 * 1부터 10까지의 합:55
 * for문
*/
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		누적 변수
		int sum = 0;
		int cnt = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			cnt++;
		}
		
		System.out.println(cnt + "까지의 합: " + sum);

	}

}
