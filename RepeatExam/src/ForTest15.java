import java.util.Scanner;

/*
 * 숫자 맞추기 
*/
public class ForTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userSelectNum = 0;
		int answer = 0;
		boolean check = false;	//기본값은 가능한한 실행문에 영향을 끼치지 않는 값으로 지정해준다.
		
		Scanner scan = new Scanner(System.in);
		
		answer = (int)(Math.random() * 100) + 1;
		
//		answer = 10; //확인을 위해 우선 숫자를 정해주고 실행해보거나 answer를 아래처럼 출력해본다.
//		System.out.println(answer);
		
		System.out.println("상대방이 숫자를 선택했습니다.");
		System.out.println("1~100사이니 맞춰보세요.");
		
		check = true;
		while(check) {
			System.out.println("1과 100 사이의 정수를 입력하세요. >\t");
			userSelectNum = scan.nextInt();
			
			if(userSelectNum > answer) {
				System.out.println("더 작은 수로 다시 시도해주세요.");
			}else if(userSelectNum < answer) {
				System.out.println("더 큰 수로 다시 시도해주세요.");
			}else if(userSelectNum == answer){
				System.out.println("정답입니다.");
				check = false;
			}
		}

	}

}
