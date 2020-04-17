/*
	1600~2020년 중 윤년인 해를 나타내시오
	
	1. 그 해의 숫자가 4의 배수인 경우는 윤년이다.
		예) 2004는 4로 나누어지므로 윤년!
	2. 그 해의 숫자가 4로 나누어지지만 100으로도 나누어 지면 윤년이 아니다.   
		예) 2100년은 4로 나누어지지만 100으로 나누어지므로 윤년이 아니다!
	3. 그 해의 숫자가 100으로 나누어지지만 400으로도 나누어 지면 윤년이다.    
		예) 2000년은 100으로 나누어지지만 400으로도 나누어지므로 윤년이다!
	참고: 그 해의 숫자가 4로 나누어지면 윤년인데 400으로도 나누어 지면 윤년이다. 
		예) 2000년은 4로 나누어지지만 400으로도 나누어지므로 윤년이다!
	===================
	윤년
	1600
	1604
	.
	.
	.
	2020
	횟수: 20
*/
public class ForTest19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		System.out.println("윤년");
		
//		for (int i = 1600; i <= 2020; i++) {
//			if(i % 4 == 0) {
//				if(i % 100 != 0) {
//					System.out.println(i);
//					count++;
//				} else if(i % 400 == 0) {
//					System.out.println(i);
//					count++;
//				}
//			}
//		}
		//if문 안에 if문은 되도록 사용하지 않는다.
		
		for (int i = 1600; i <= 2020; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i);
				count++;
			}
		}
			
		System.out.println("횟수: " + count);

	}

}
