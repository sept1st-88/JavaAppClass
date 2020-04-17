package com.tg.throwss;

public class ExceptionEx8Main {

	public static void main(String[] args) throws Exception { //나를 호출한 곳으로 다시 보낸다
		// TODO Auto-generated method stub
		
		Test1 test1 = new Test1();
		
		test1.method1();
		
//		try {
//			test1.method1();
//			System.out.println("dsfdsf");	//메서드로 들어가서 실행하다가 throw를 만나면 
//		} catch (Exception e) {				//메서드 상위로 올라와서 다시 나와서 catch로 넘어가는거다
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("예외처리 됨");
//		}
		
		System.out.println("종료됨");

	}

}
