/*
 * tv 별칭
 * 일반 tv
 * 은소거 tv
 * 자막 tv
 * 
 * String name = "";
 * 
 */

public class TvTest {

	public static void main(String[] args) {
//		
//		Tv는 볼륨이 있다.
//		Tv는 볼륨을 1올리고 1내리는 기능이 있다.
//		음소거 Tv를 만든다.
//		음소거가 있다.
//		음소거 버튼을 누르면 음소거가 된다.
//		음소거 된 상태에서 다시 음소거 버튼을 누르면 이전의 볼륨 상태로 돌아간다.
		
		Tv tv = new Tv("일반TV", true, 5, 20);
		CaptionTv Tv = new Tv("캡션티비", false, 10, 30);
		MuteTv muteTv = new MuteTv();
		
//		tv.tvInfo();
//		tv.channelDown();
//		tv.tvInfo();
//		tv.channelUp();
//		tv.tvInfo();
		
		captionTv.tvInfo();
		captionTv.volumeDown();
		captionTv.tvInfo();
		captionTv.volumelUp();
		captionTv.tvInfo();
		
	} // main
}
