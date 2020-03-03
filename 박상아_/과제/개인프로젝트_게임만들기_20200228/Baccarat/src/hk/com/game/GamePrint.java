package hk.com.game;

import java.util.Iterator;
import java.util.List;

import hk.com.UserDTO;
import hk.com.util.PrintCard;
import hk.com.util.PrintDesign;
import hk.com.util.UtilMethod;


public class GamePrint extends GameMaster {
	
	PrintCard pc;
	PrintDesign pd;
	UtilMethod um;
	
	public GamePrint() {
		pc = new PrintCard();
		pd = new PrintDesign();
		um = new UtilMethod();
	}
	
	public void printTwoCard() 
	{	
		String p = player.getRule();
		String b = banker.getRule();
		
		System.out.print("카드 분배중.");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".\n");
		
		System.out.println("[ Player Two Card ]");
		System.out.println( pc.bigSizeCard(player.getFirstCard()) );
		System.out.println( pc.bigSizeCard(player.getSecondCard()) );
		System.out.println();
		
		um.sleep1s();
				
		if ( p.equalsIgnoreCase("stand"))
		{
			pd.printStand();
		}
		else if ( p.equalsIgnoreCase("natural"))
		{
			pd.printNatural();
		}
		else
		{
			pd.printNormal();
		}	
		System.out.println();
		
		um.sleep3s();
		
		System.out.println("[ Banker Two Card ]");
		System.out.println( pc.bigSizeCard(banker.getFirstCard()) );
		System.out.println( pc.bigSizeCard(banker.getSecondCard()) );		
		System.out.println();
		
		um.sleep1s();		
		
		if ( b.equalsIgnoreCase("stand"))
		{
			pd.printStand();
		}
		else if ( b.equalsIgnoreCase("natural"))
		{
			pd.printNatural();
		}
		else
		{
			pd.printNormal();
		}
		System.out.println();
	}
	
	public void printTwoSum()
	{
		System.out.println(player.getScore() + " : " + banker.getScore());
		
		System.out.println();
	}
	
	public void printRule() 
	{
		String p = player.getRule();
		String b = banker.getRule();
				
		System.out.println("[ Player Score Type ]");
		
		if ( p.equalsIgnoreCase("stand"))
		{
			pd.printStand();
		}
		else if ( p.equalsIgnoreCase("natural"))
		{
			pd.printNatural();
		}
		else
		{
			pd.printNormal();
		}
		
		System.out.println("[ Banker Score Type ]");
		
		if ( b.equalsIgnoreCase("stand"))
		{
			pd.printStand();
		}
		else if ( b.equalsIgnoreCase("natural"))
		{
			pd.printNatural();
		}
		else
		{
			pd.printNormal();
		}

		
		System.out.println();
	}
	
	public void printThreeCard() 
	{
		um.sleep1s();
		System.out.print("3번째 카드를 준비중입니다.");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".\n");
		
		System.out.println("[ Player Three Card ]");
		System.out.println( pc.bigSizeCard(player.getFirstCard()) );
		System.out.println( pc.bigSizeCard(player.getSecondCard()) ); 
		System.out.println( pc.bigSizeCard(player.getThirdCard()) );
		
		um.sleep3s();
		
		System.out.println("[ Banker Three Card ]");
		System.out.println( pc.bigSizeCard(banker.getFirstCard()) );
		System.out.println( pc.bigSizeCard(banker.getSecondCard()) );
		System.out.println( pc.bigSizeCard(player.getThirdCard()) );
		
		System.out.println();
	}

	public void printResult() 
	{	
		um.sleep1s();
		System.out.print("Score 계산중.");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".");
		um.sleep1s();
		System.out.print(".\n");
		
		System.out.println("Player : " + player.getScore() + " VS " + "Banker : " + banker.getScore());
		System.out.println();
	}

	public void printWinner(String winner) 
	{
		um.sleep1s();
		System.out.print("승자 !!!!!!");
		um.sleep1s();
		System.out.print("!");
		um.sleep1s();
		System.out.print("!");
		um.sleep1s();
		System.out.print("!\n");
		
		if ( winner.equalsIgnoreCase("player"))
		{
			pd.printPlayerWin();
		}
		else if ( winner.equalsIgnoreCase("banker"))
		{
			pd.printBankerWin();
		}
		else
		{
			pd.printTieWin();
		}
		
		System.out.println();
	}

	public void printUser(List<UserDTO> uList) 
	{
		Iterator<UserDTO> list = uList.iterator();
		UserDTO dto = new UserDTO();
		System.out.println("[ User Info. ]");
		
		while(list.hasNext())
		{
			dto = list.next();
			System.out.println("[ " + dto.getName() +  "님의 Game Money: " + dto.getMoney() + "]");
		}
		
		System.out.println();
	}

	public void printMain() {
		
		pd.printMain();	
		System.out.println();
	}
}
