
public class GuGuDan {

	public static void main(String[] args) {
//		1차 배열 , 2차 배열을 이용하여 구구단을 만들어라
//		넵 ~ !
//		=================================
		System.out.println("★☆★☆★☆★☆★☆★☆ 구구단을 외자 ! 구구단을 외자 ! ★☆★☆★☆★☆★☆★☆"); //인트로
//		===================1차 배열 구현===========================
		int[] googooCon = new int[72]; // 1차배열 결과를 저장할 변수
		int index = 0; // 1차배열값의 위치값에 대한 정보를 저장할 인덱스 변수 
		System.out.print("▷ 1차배열을 이용한 구구단");
		
		for(int i = 0; i < 8; i++) {
			for(int n = 0; n < 9; n++){
				if(n==0) {
					System.out.println(); // 2,3,4, .... ,9단 과 같이 각 단에 맞춰 띄어쓰기
					System.out.print((i+2) + "단▶▶▶\t"); // 각 행의 단 정보 출력
				}
				googooCon[index] = (i+2) * (n+1); //배열의 index 위치에 구구단의 결과를 삽입
				System.out.print((i+2)+"X"+(n+1)+"="+googooCon[index] + "\t"); // 삽입된 결과값을 출력 후 간격을 띄움
				index++; //배열의 index값을 증가시켜 다음 위치에 저장할 수 있도록 한다.
			}
		}
		System.out.println(); // 구별을 위해 한칸 띄기
//		===================2차 배열 구현===========================
		int[][] guguCon = new int[8][9]; // 2차배열 결과를 저장할 변수
		System.out.print("▷  2차배열을 이용한 구구단");
		
		for(int i = 0; i < 8; i++) {
			for(int n = 0; n < 9; n++){
				if(n==0) {
					System.out.println(); // 2,3,4, .... ,9단 과 같이 각 단에 맞춰 띄어쓰기
					System.out.print((i+2) + "단▶▶▶\t"); // 각 행의 단 정보 출력
				}
				guguCon[i][n] = (i+2) * (n+1); //i,n을 이용하여 각각의 2차배열의 위치값에 각각의 구구단 결과값을 삽입
				System.out.print((i+2)+"X"+(n+1)+"="+guguCon[i][n] + "\t"); // 삽입된 결과값을 출력 후 간격을 띄움
			}
		}
	}

}