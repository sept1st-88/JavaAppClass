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
	
	
}