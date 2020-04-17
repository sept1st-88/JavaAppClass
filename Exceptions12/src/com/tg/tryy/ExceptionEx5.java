package com.tg.tryy;

public class ExceptionEx5 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/4);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		} finally {	//catch가 예외가 있든 아니든 끝나면 무조건 finally로 바로 가서 finally는 뜬다
			System.out.println(6);
		}
		System.out.println(7);
		
	}

}
