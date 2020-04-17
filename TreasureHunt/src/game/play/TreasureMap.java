package game.play;

import java.util.ArrayList;
import java.util.Scanner;

public class TreasureMap {
	
	private int col = 0; //지도 행 값 초기화 
	private int squares = 0; //총 칸수 초기화 
	private ArrayList tArrList = null; //지도칸 배열리스트 초기화 
	private int tIdx = 0; //보물 위치 배열 초기화 
	
	public TreasureMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	//지도에 빈칸 지정 
	public void makeMap() {
		col = 7; //지도 행 값 지정 (총 칸수 조정) 
		tArrList = new ArrayList(50); //지도 배열리스트 초기화 
		squares = col * col; //총 칸수 
		
		
		//지도(칸)에 빈칸 배정 
		for (int i = 0; i < squares; i++) {
			tArrList.add(i, "  ");
		}
	}
	
	//보물 위치 지정 
	public void hideTreasure() {
		//보물 위치 칸 값 랜덤으로 지정 (0~24) 
		tIdx = (int)(Math.random() * tArrList.size());
		//보물 위치 확인 
//		System.out.println("보물 위치: " + (tIdx + 1));
	}
	
	//보물 위치에 *표시 입력 
	public void printT() {
		tArrList.set(tIdx, "* ");
	}
		
	//지도 출력 
	public void printMap() {
		int count = 0;
				
		for (int i = 0; i < col + 1; i++) {
			for (int n = 0; n < col; n++) {
				System.out.print(" ───"); //가로 테두리 출력 
			}
			System.out.println();
			for (int j = 0; j < col + 1; j++) {
				if(i != col) {
					System.out.print("│ "); //세로 테두리 출력 
					if(j != col) { //실제 칸 출력 
						//지도칸 배열리스트 출력 
						System.out.print(tArrList.get(count));
						count++;
					}
				}
			}
			System.out.println();
		}//for문 끝 
	}
	
	//게임 실행 
	public void play() {
		int input = 0; //사용자 입력 값 초기화 
		int com = 0; //컴퓨터(바르보사) 입력 값 초기화 
		
		System.out.println("▷ 보물이 숨어있을거 같은 지도 칸을 선택해 주세요 (1~" + squares + ")");
		
		while(true) {
			
			while(true) {
				try {
					Scanner scan = new Scanner(System.in);
					input = scan.nextInt(); //사용자 입력값 
					break;
				} catch (Exception e) { //숫자외에 입력했을 시 
					System.err.println("잘 못 입력했습니다. 숫자를 입력해주세요.");
				}
			}//while문 end 
			
			com = (int)(Math.random() * 25) + 1; //컴퓨터(바르보사) 입력 값 
			
			System.out.println("당신이 입력한 칸은 " + input); //사용자 입력 값 출력 
			System.out.println("바르보사가 입력한 칸은 " + com); //컴퓨터 입력 값 출력 
			
			//둘이 동시에 맞췄을 시 
			if(input - 1 == tIdx && com - 1 == tIdx) {
				System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
				System.out.println("              TIED");
				System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
				System.out.println("당신과 바르보사가 동시에 보물을 찾았습니다..");
				break;
			}
			//사용자가 맞췄을 시 
			if(input - 1 == tIdx) {
				System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("           YOU WIN!");
				System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("♬ ♬ 축하합니다! 보물을 찾았습니다! ♬ ♬");
				System.out.println("당신과 잭은 함께 보물을 나눠갖기로 합니다.");
				break;
			}else if(com - 1 == tIdx) { //컴퓨터(바르보사)가 먼저 맞췄을 시 
				System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("         YOU LOSE");
				System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("바르보사가 먼저 보물을 찾았습니다..");
				System.out.println("바르보사에게 패배하였습니다 :(");
				break;
			}
			
			//둘 다 못 맞췄을 시 사용자에게 제공되는 힌트 
			if(input - 1 > tIdx) {
				System.out.println("▷ 힌트: \"당신이 입력한 값보다 DOWN ▼\"");
			}
			if(input - 1 < tIdx) {
				System.out.println("▷ 힌트: \"당신이 입력한 값보다 UP ▲\"");
			}
			if(com -1 < tIdx) {
				System.out.println("▷ 힌트: \"바르보사가 입력한 값보다 UP ▲\"");
			}
			if(com - 1 > tIdx) {
				System.out.println("▷ 힌트: \"바르보사가 입력한 값보다 DOWN ▼\"");
			}
		} //while문 끝 
		
	} //play메서드 끝 

}
