
/*
 * 누적 활용
 * 100을 넘지 않는 제일 큰 수를 출력한다.
 * ======================
 * 1 - 1
 * 2 - 3
 * 3 - 6
 * 4 - 10
 * 5 - 15
 * ..........
 * 13 - 91
 * 
*/
public class ForTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int sum = 0;
		
//		for (int i = 1; i <= 100; i++) {
//			count++;
//			sum = sum + count;
//			if(sum <= 100) {
//				System.out.println(count + " - " + sum);
//			}
//		}
		
		while (count <= 100) {
			count++;
			sum = sum + count;
			
			if (sum <= 100) {
				System.out.println(count + " - " + sum);
			}
		}

	}

}
