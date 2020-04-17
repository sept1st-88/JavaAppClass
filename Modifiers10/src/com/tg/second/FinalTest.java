package com.tg.second;

// final?
// 마지막의, 변경될 수 없는
// final이 사용될 수 있는 곳
// 클래스, 메서드, 멤버변수, 지역변수

// 앞으로는 일반 변수들은 (default) 지역변수로만 사용한다.

final class FinalTest {	//이 클래스 내에 코드는 모두 완전하다. 절대 재정의 할 수 없다. 그러므로 결코 부모가 될 수 없다
	
//	상수(고정) 값은 파스칼 표기법으로 작성한다
	final static int MAX_SIZE = 100;	//final static - 모든 곳에서 (공통적으로) 불변의 변수
	
	final int max() {
		final int tempNum = 0;
//		MAX_SIZE = 32;	//변경 할 수 없다
		Math.random();
		
		return tempNum;
	}
	
}
