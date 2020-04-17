public class MuteTv extends Tv{
	
	int preVolume; // 이전 볼륨
	// true음소거인 상태, false 음소거 꺼져있는 상태
	boolean noSound = true; // 눌렀는지 여부 
	
	void muteTv() {
		if(noSound) {
			preVolume = volume;
			volume = 0;
			noSound = false;
			System.out.println("음소거가 되었습니다.");
		}else{
			volume = preVolume;
			noSound = true;
			System.out.println("음소거가 풀리고 이전 volume : " 
					+ volume + "로 돌아갑니다.");			
		}
	}
	
	//나의 멤버변수 모두 출력
	void muteTvInfo() {
		System.out.println("현재 티비 타입 : " + name);
		System.out.println("전원: " + power);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		System.out.println("음소거 여부: " + noSound);
	}
	
}