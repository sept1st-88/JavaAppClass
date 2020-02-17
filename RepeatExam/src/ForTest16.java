import java.util.Scanner;

/*
 * 1~100의 범위에서 홀수만 더한다
 * 단 10번 더했다면 10까지 더한 값을 출력한다
 * break를 활용한다
 * ========================
 * 1번째 누적값 : 0 + 1 = 1
 * 2번째 누적값 : 1 + 3 = 4
 * 3번째 누적값 : 4 + 5 = 9
 * 10번 수행
 * 100
*/
public class ForTest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 1) {
				count++;
				System.out.print(count + "번째 누적값 : " + sum + " + " + i + " = " );
				
				sum = sum + i;
				
				System.out.println(sum);
				
				if(count == 10) {
					break;
				}
			}
			
		}

	}

}
