public class TvTest {

	public static void main(String[] args) {
//		
//		Tv는 볼륨이 있다.
//		Tv는 볼륨을 1올리고 1내리는 기능이 있다.
//		음소거 Tv를 만든다.
//		음소거가 있다.
//		음소거 버튼을 누르면 음소거가 된다.
//		음소거 된 상태에서 다시 음소거 버튼을 누르면 이전의 볼륨 상태로 돌아간다.
		
		MuteTv Tv = new MuteTv();
		Tv.volume = 10;
		
		Tv.volumeInfo();//볼륨 정보 출력
		Tv.soundUp();	//볼륨 증가
		Tv.volumeInfo();
		Tv.soundDown(); //볼륨 다운
		Tv.volumeInfo();
		
		Tv.muteTv();	//음소거
		Tv.volumeInfo();
		Tv.muteTv();	//음소거해제
		Tv.volumeInfo();

		Tv.muteTv();	//음소거
		Tv.volumeInfo();
		Tv.muteTv();	//음소거해제
		Tv.volumeInfo();
		
	} // main
}