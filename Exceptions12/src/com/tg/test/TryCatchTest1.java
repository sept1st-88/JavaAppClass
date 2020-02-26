package com.tg.test;

import java.util.Scanner;

public class TryCatchTest1 {
	
	public static void main(String[] args) {
		
//		사용자의 입력을 받아서
//		주사위 숫자를 맞추는 프로그램을 만드시오
//		예외 발생시 잘못입력했습니다
//		프로그램이 종료됩니다
//		
//		3
//		맞췄습니다
//		틀렸습니다
		
		Scanner scan = new Scanner(System.in);
		
		int diceNum = 0;
		int inputNum = 0;
		
		System.out.println("주사위 숫자를 맞추시오");
		diceNum = (int)(Math.random() * 6) + 1;
		
		try {
			inputNum = scan.nextInt();
			if(inputNum == diceNum) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("정답: " + diceNum);
				System.out.println("틀렸습니다.");
			}
		}catch (Exception e) {
			System.out.println("잘못 입력했습니다.");
		}finally {
			System.out.println("종료됩니다.");
		}
		
//		외부 라이브러리?
		
		
	}

}
