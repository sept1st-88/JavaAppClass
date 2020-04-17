package com.tg.third;
//접근 제어자(access modifier)? - 보완의 영역
//	접근제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서
//	접근하지 못하도록 제한하는 역할을 한다
//	접근 제어자가 default임을 알리기 위해 실제로 default를 붙이진 않는다
//	클래스나 멤버변수, 메서드, 생성자에 접근 제어자가 지정되어 있지 않다면,
//	접근 제어자가 default임을 뜻한다

// 캡슐화 (encapsulation)
public class Time {
	
	private int hour;		//보안의 문제(해킹)로 숨겨놓는다
	private int minute;		//앞으로 모든 멤버 변수는 private
	private int second;
	
	public Time(int hour, int minute, int second) {	//public이나 등 안 써져 있으면 묵시적으로 default가 작성되어 있다
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {	//return(반환)을 하는 부분
		return hour;
	}
	
	public void setHour(int hour) {	//hour를 세팅 하는 부분
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
