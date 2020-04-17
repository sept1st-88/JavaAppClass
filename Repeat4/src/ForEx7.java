
public class ForEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		int mulNum = 0;
		
//		for (int i = 2; i <= 9; i++) {
//			for (int n = 1; n <= 9; n++) {
//				mulNum = i * n;
//				str = i + " * " + n + " = " + mulNum + "\t";
//				System.out.print(str);
//			}
//			System.out.println();
//		}
		
		int dan = 0;
		int n = 0;
		
		dan = 2; //for문에서 초기화값
		n = 1;
		
		while (dan <= 9) { //for문에서 조건식
			while(n <= 9) {
				mulNum = dan * n;
				str = dan + " * " + n + " = " + mulNum + "\t";
				System.out.print(str);
				n++;
			}
			n = 1;
			System.out.println();
			dan++;//for문에서 증가식
		}
		
	}

}
