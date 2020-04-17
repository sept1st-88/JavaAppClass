package com.tg.tryy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자만 입력");
		
		int n = 0;
		
//		n에 대해서 오류가 발생하면 n을 자신의 값으로 두자
		try {
			n = scan.nextInt();
		} catch (InputMismatchException e) { //InputMismatchException이라는 에러의 내용을 e에 담음
			System.out.println(e);
			e.printStackTrace();
			System.out.println("예외메시지: " + e.getMessage());
//			System.out.println("error");
			n = -1;
		}
		
		System.out.println(n);
	}

}
