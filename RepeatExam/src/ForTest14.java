import java.util.Scanner;

/*
 * 스마트 구구단
 * 사용자가 원하는 단만 출력하는 프로그램
 * 사용자가 0을 누르면 종료한다.
 * ================================
 * 2단
   2 * 1 = 2	2 * 2 = 4	2 * 3 = 6 ......
   2 * 6 = 12 .........
   
   -10단
    -10 * 1 = -10
 * 
*/
public class ForTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구구단에서 원하는 단을 입력하시오.(0을 누르면 종료됩니다).");
		
		int input = 0;
		int num = 0;
		int result = 0;
		boolean flag = false;

		num = 1;
		flag = true;
		
		while(flag) {
			System.out.println(">>");
			input = scan.nextInt();
			
			if(input != 0) {
				System.out.println(input + "단");
				while(num <= 19) {
					result = input * num;
					System.out.print(input + " * " + num + " = " + result + "\t");
					if(num % 5 == 0) {
						System.out.println();
					}
					num++;
				}
				num = 1;
				System.out.println();
			}else {
				flag = false;
				System.out.println("종료됩니다.");
			}
			
		}

	}

}
