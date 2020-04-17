package com.tg.tryy;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {	//예외처리에 포함
			System.out.println(3);
			System.out.println(0/0);	//0으로 나누어서는 안된다는 ArithmeticException.
			//원래는 바로 위에서 오류부분이 나서 여기서 종료된다.
			//try를 이용해서 오류 나는 부분을 스킵하고 바로 catch부분으로 넘어간다
			//try문에 있는 모든 내용에 오류가 없다면 catch부분을 스킵하고 나가버린다!
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		
		System.out.println(6);
		
	}

}
