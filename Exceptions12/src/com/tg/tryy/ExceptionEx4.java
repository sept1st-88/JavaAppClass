package com.tg.tryy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(1);
		System.out.println(2);
		
		try {	//예외처리가 필요한 부분 포함
			int n = scan.nextInt();
			System.out.println(3);
			System.out.println(0/0);	//0으로 나누어선 안된다
			System.out.println(4);
		} catch(ArithmeticException ae) {		//Exception을 ArithmeticException위에서 사용할 수 없는 이유는,
			ae.printStackTrace();				//Exception안에 AE가 있기 때문이다. Exception은 모든지 다 포함되어 있기 때문에
		} catch(InputMismatchException ae) {	//AE가 아래 있으면 AE까지 도달할 수 가 없다.
			ae.printStackTrace();				//상세하게 할때 아니면은 그냥 무조건 Exception을 사용하면 된다.
		} catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
		
	}

}
