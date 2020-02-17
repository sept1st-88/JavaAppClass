
public class FlowTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random() * 6) + 1;
		
		switch (num) {
			case 1:
				System.out.println("1이 나왔습니다");
				break;
			case 2:
				System.out.println("2가 나왔습니다");
				break;
			case 3:
				System.out.println("3이 나왔습니다");
				break;
			case 4:
				System.out.println("4가 나왔습니다");
				break;
			case 5:
				System.out.println("5가 나왔습니다");
				break;
			case 6:
				System.out.println("6이 나왔습니다");
				break;
			default:		//경우의 수와 케이스의 수가 동일해서 default가 나올 일이 없다고 해도 포함 시켜주어야 한다.
				System.out.println("잘못돌렸습니다");
				break;
		}

	}

}
