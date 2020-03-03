package hk.com.game;

import java.util.Iterator;
import java.util.List;

import hk.com.AdminDTO;
import hk.com.UserDTO;
import hk.com.card.CardDeck;
import hk.com.rule.BaccaratRule;
import hk.com.util.UtilMethod;

public class GameProcess extends GameMaster{
	
	private List<UserDTO> uList;	// All 유져를 담는 List
	private List<UserDTO> win;	// Winner 유져를 담는 List
	private List<UserDTO> loose;	// Looser 유져를 담는 List
	private String winner;
	
	// 걍 일반적인 Class 호출 위한 객체 선언
	private Iterator<String> it;
	private GameBatting gb;
	private GamePrint gp;
	private BaccaratRule gr;	
	private GameMakeUser gu;
	private UtilMethod um;
	
	private void playGame()	// 게임 한번 진행
	{		
		setPeople();		// User, Banker 생성
		setCardDeck();		// Random 52장 카드덱 생성
		
		setFirstCard();		// 1번 카드 세팅		
		setSecondCard();	// 2번 카드 세팅		
		
		setBatting();		// Batting 전 초기화 작업		
		
		if(uList.isEmpty()){
			System.out.println("게임을 이용할 수 있는 손님이 존재하지 않습니다.");
			return;
		}
		
		setScore();			// 카드 2장 합 구하기 
//		gp.printTwoSum();	// 카드 2장 합 출력
		
		setRule();			// 아래 출력을 위한 스트링 셋팅
		gp.printTwoCard();	// 카드 오픈
		
//		gp.printRule();		// Stand, Natural 여부 출력
				
		setThirdCard();		// 3번 카드 세팅		
		gp.printThreeCard();// 카드 3장 오픈
		
		setRetryScore();			// 카드 3장 합 구하기
		gp.printResult();	// 카드 3장 합 출력		
		
		setWinner();		// 승자 구하기				
		gp.printWinner(winner);	// 승자 출력
		
		setResultBatting();	// Batting 분배
		gp.printUser(uList);
	}

	public void loopGame()
	{			
		setInstance();		// 필요 객체 생성(실제 게임과 관련 X)
		
		gp.printMain();		// Main 화면 Print
		
		uList = gu.makeUser();	// User 생성
		String loop = "";
		while(true)
		{
			playGame();		// Game 한번 실행
			if(uList.isEmpty()){
				// 다시 손님을 받을 수 있게 구해보자
				break;
			}
			loop = um.inputLoop();
			
			if( loop.equalsIgnoreCase("N") )
			{
				System.out.println("Bye");
				break;
			}			
		}
	}
	

	private void setInstance() 	// 다른 Class 객체 부르기
	{	
		gb = new GameBatting();
		gp = new GamePrint();
		gr = new BaccaratRule();
		gu = new GameMakeUser();
		um = new UtilMethod();		
	}

	private void setPeople()
	{
		player = new AdminDTO();	// User 정보 생성...? Player 정보 생성 아닌가?
		banker = new AdminDTO();	// Banker 정보 생성		
	}
	
	private void setCardDeck()
	{
		CardDeck cd = new CardDeck();	
		fDeck = cd.getCardDeck();	// Random 52장 Card Deck 생성		
		it = fDeck.iterator();
	}
	
	private void setFirstCard()		// Iterator Pattern
	{	
		player.setFirstCard(it.next());	
		banker.setFirstCard(it.next());					
	}
	
	private void setSecondCard()
	{
		player.setSecondCard(it.next());
		banker.setSecondCard(it.next());
		player.setThirdCard("   ");
		banker.setThirdCard("   ");
	}
	
	private void setScore() 			// 카드 두장 합(호출) 
	{
		player.setScore( um.sumNum(player) );
		banker.setScore( um.sumNum(banker) );	
	}
	
	private void setRetryScore() 			// 카드 세장 합(호출) 
	{
		player.setScore( um.sumResult(player) );
		banker.setScore( um.sumResult(banker) );	
	}
	
	private void setRule()
	{
		gr.setRule();
	}
	
	private void setThirdCard()
	{
		
		if( gr.playerthird(banker) )
		{
			player.setThirdCard(it.next());
		}
		else
		{
			player.setThirdCard("   ");
		}
		
		if( gr.bankerthird(player, banker) )
		{
			banker.setThirdCard(it.next());
		}	
		else
		{
			banker.setThirdCard("   ");
		}
	}		
		
	private void setBatting()	// 배팅 시작하기전에 해야할 체크들 
	{
		uList = gb.battingCheck(uList);
		
		if(uList.isEmpty()){
			return;
		}
		
		gb.battingChoice(uList);	
		gb.battingSetMoney(uList);		
	}
	
	private void setWinner() 
	{
		winner = um.whoWinner(player, banker);	// 승리자 누군자 String 가져옴		
	}
	
	private void setResultBatting() 
	{
		gb.battingResultCal(uList, winner);		
	}	
	
	
}
