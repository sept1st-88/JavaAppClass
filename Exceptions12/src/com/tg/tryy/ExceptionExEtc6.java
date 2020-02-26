package com.tg.tryy;

import net.mega.MyInputUtil;

public class ExceptionExEtc6 {

	public static void main(String[] args) {
		
//		사용자가 잘못입력하면 0으로 무조건 출력한다
		
		//가져온 라이브러리 util을 사용한다
		MyInputUtil miu = new MyInputUtil();
		
		int n = miu.getUserInputNumber();
		
		System.out.println(n);
		
	}

}
