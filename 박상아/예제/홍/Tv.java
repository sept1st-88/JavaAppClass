public class Tv {
//	속성 - 크기, 길이, 색상, 볼륨, 채널 등
//	기능 - 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등
	
	boolean power; //전원 ( on/off )
	int channel;	//채널 ( 숫짜아~ )
	int volume;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void soundUp() {
		volume++;
	}
	
	void soundDown() {
		volume--;
	}
	
	void volumeInfo() {
		System.out.println("현재 사운드 : " + volume);
	}
}