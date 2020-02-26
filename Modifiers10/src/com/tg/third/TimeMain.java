package com.tg.third;

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time(12, 35, 30);
		
		System.out.println(time);
//		time.hour = 13;	//private(숨김)으로 변수를 잡아놔서 직접적으로 접근 불가
		time.setHour(13);
		
		int hour = time.getHour();
		System.out.println(hour);
		System.out.println(time);

	}

}
