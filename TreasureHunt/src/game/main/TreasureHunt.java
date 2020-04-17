package game.main;

import java.util.Scanner;

import game.Intro;
import game.play.TreasureMap;
import game.player.PlayerVo;

public class TreasureHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false; //전체 게임 while문 조정 초기값 
		
		Intro intro = new Intro(); //안내문 
		PlayerVo player = new PlayerVo(); //사용자 정보 
		TreasureMap tMap = new TreasureMap(); //게임 
		
		Scanner scan = new Scanner(System.in);
		
		intro.introStr(); //게임 소개 출력 
		player.setName(); //사용자 이름 입력 
		
		String name = player.getName(); //사용자 이름 출력 
		
		System.out.println("▷ " + name + "님 어서오세요. 잭스패로우가 " 
				+ name + "님의 도움을 필요로 하고 있습니다.");
		System.out.println("▷ 악당 바르보사 보다 먼저 보물을 찾는데 도움을 주세요.");
		System.out.println("▷ 아래 지도에서 바르보사보다 먼저 보물을 찾으면 승리입니다! "
				+ "(잭스패로우가 힌트를 줄 거에요.)");
		
		flag = true;
		
		while(flag) {
			tMap.makeMap(); //지도 빈칸 지정 
			tMap.printMap(); //비어있는 지도 출력 
			tMap.hideTreasure(); //보물 위치 지정 
			tMap.printT(); //보물 위치 *표시 입력 
			tMap.play(); //게임 진행 
			tMap.printMap(); //보물 *표시된 지도 출력 
			
			System.out.println("다시 도전해 보겠습니까? Y/N ▷▷");
			
			//재도전 여부 
			while(true) {
				String input = scan.nextLine();
				
				if(input.equalsIgnoreCase("y")) {
					break;
				}else if(input.equalsIgnoreCase("n")) {
					System.out.println("종료합니다. 안녕히가세요 :)");
					flag = false;
					break;
				}else {
					System.err.println("잘 못 입력하였습니다. 다시 입력해주세요.");
				}
			}
		}

	}

}
