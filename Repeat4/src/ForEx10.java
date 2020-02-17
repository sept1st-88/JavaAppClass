import java.util.Scanner;

public class ForEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		continue문 	//블록을 마주쳤다고 생각하면 된다. 멈추는 것이 아니라 위로 다시 올라간다. (특별한 경우 아닌 이상 사용하지 않는다)
		
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
