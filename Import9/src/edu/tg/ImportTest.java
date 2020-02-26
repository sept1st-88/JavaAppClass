package edu.tg;

import java.text.SimpleDateFormat;
import java.util.*;	// 애스테리크 - * =? 모든 경우. util내에 모든 클래스를 불러온다
//import java.util.Calendar;
//import java.util.Scanner;
//import java.util.Date;
//import java.util.ArrayList;

// 뒤에 대문자 들어가는 것들이 클래스 (ex. SimpleDateFormat, Date)
// 앞에 오는 것들은 디렉토리 (java(대분류), text(중분류), util(중분류))

// import문
// 소스코드(src)를 작성할 때 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
// 하지만 매번 패키지명을 붙여서 작성하기란 여간 불편한 일이다
// 클래스의 코드를 작성하기 전에 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면
// 소스코드에 사용되는 클래스이름에서 패키지명은 생략할 수 있다

// 일반적인 소스파일(*.java)의 구성은 다음의 순서로 되어 있다
// 1 package문
// 2 import문
// 3 클래스 선언

// import문 표현식
// import 패키지명.클래스명;
// or
// import 패키지명.*;

public class ImportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		//import가 없으면 원래는 이렇게 작성
//		java.util.Date today = new java.util.Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh/mm/ss a");
		
		System.out.println(date.format(today));
		String timeStr = time.format(today);
		System.out.println(timeStr);
		
	}

}
