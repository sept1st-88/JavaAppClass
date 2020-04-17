package net.mega;

import java.util.Scanner;

public class MyInputUtil {
	
	/**
	 * 사용자가 키보드로 입력한 숫자 값을 반환한다
	 * @return int형
	 */
	public int getUserInputNumber() {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("숫자를 입력해주세요");
		
		try {
			num = scan.nextInt();
		} catch (Exception e) {
			num = 0;
		}
		
		return num;
	}

}
