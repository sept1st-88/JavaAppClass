package hk.com.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import hk.com.UserDTO;
import hk.com.batting.BankerBattingCalculate;
import hk.com.batting.IBattingInter;
import hk.com.batting.PlayerBattingCalculate;
import hk.com.batting.TieBattingCalculate;

public class GameBatting extends GameMaster{

	private Scanner scan;	
	private String errMsg = "Error ! : ";
	private Iterator<UserDTO> it;
	private UserDTO uDto;
		
	private IBattingInter pl;
	private IBattingInter ba;
	private IBattingInter ti;
	
	public GameBatting() {
		scan = new Scanner(System.in);
		pl = new PlayerBattingCalculate();
		ba = new BankerBattingCalculate();
		ti = new TieBattingCalculate();		
	}
	
	public void battingChoice(List<UserDTO> list) 
	{		
		it = list.iterator();		
				
		while (it.hasNext()) 
		{
			uDto = it.next();
			uDto.setChoice( inputChoice(uDto.getName()) );					
		}
		System.out.println("User Choice END!!\n");		
			
	}
	
	private int inputChoice(String name)
	{
		int num = 0;
		
		while(true)
		{
			System.out.print(name + "님 어디에 거실?(1:Player, 2:Banker, 0:Tie) : ");
			num = scan.nextInt();
			
			if ( num < 0 || num > 2 )
			{
				System.out.println(errMsg + "입력 범위 확인!!(1 / 2 / 0)");
			}
			else
			{
				System.out.println(name + "님 " + (num == 1 ? "Player" : ( num == 2 ) ? "Banker" : "Tie" ) + " 선택!");
				break;
			}
		}		
		
		return num;
	}

	public void battingSetMoney(List<UserDTO> list)
	{
		it = list.iterator();
				
		while (it.hasNext()) 
		{
			uDto = it.next();
			// 이부분을 10000원 단위로 숫자를 입력가능하게 해야할 거 같은데?
			uDto.setBattingMoney(minBatting);
			
			// 가진 돈 보다 베팅 금액이 크면 게임 이용자를 배제시킨다.
//			uDto.setMoney( (uDto.getMoney() - minBatting) );
		}
	}
	
	public List<UserDTO> battingCheck(List<UserDTO> list) 
	{
		List<UserDTO> temp = new ArrayList<UserDTO>();
		it = list.iterator();		
		IBattingInter bi = new PlayerBattingCalculate();		
		
		while (it.hasNext()) 
		{
			uDto = it.next();
			
			if( bi.userMoneyCheck(uDto) )
			{
				temp.add(uDto);				
			}
			else
			{
				System.out.println(uDto.getName() + "님은 돈이 없어서 파산요");
				temp.remove(uDto);
			}			
		}	
		
		System.out.println();
		
		return temp;
	}
	
	public void battingResultCal(List<UserDTO> uList, String win) 
	{		
		Iterator<UserDTO> uit = uList.iterator();
		List<UserDTO> winner = new ArrayList<UserDTO>(); 
		List<UserDTO> looser = new ArrayList<UserDTO>();
				
		int winChoice = numWinner(win);	// 누가 이긴걸로 함? (1.Player, 2.Banker, 0.Tie(무승부))
		while (uit.hasNext()) 
		{
			uDto = uit.next();
			
			if(winChoice == uDto.getChoice())
			{
				winner.add(uDto);
			}
			else
			{
				looser.add(uDto);
			}			
		}		
		
		calMoney(uList, winner, looser);  
	}	
	
	private int numWinner(String win)
	{
		int winNum = 0;
		
		if( win.equalsIgnoreCase("Player") )
		{
			winNum = 1;
		}
		else if ( win.equalsIgnoreCase("Banker") )
		{
			winNum = 2;
		}
		else
		{
			winNum = 0;
		}
		
		return winNum;
	}
	
	private void calMoney(List<UserDTO> uList, List<UserDTO> winner, List<UserDTO> looser)
	{
		winChoice(winner);
		pl.userLoseWithdraw(looser);
		pl.adminMoneyGet(player);
		pl.adminMoneyGet(banker);
		pl.adminBattingMoneyInit(player);
		pl.adminBattingMoneyInit(banker);
		setUserInit(uList);
	}
	
	private void winChoice(List<UserDTO> winner)
	{
		it = winner.iterator();
		
		while(it.hasNext()){
			uDto = it.next();
			
			int choice = uDto.getChoice();
			
			if ( choice == 1 )
			{
				pl.userWinWithdraw(winner);
			}
			else if ( choice == 2 )
			{
				ba.userWinWithdraw(winner);
			}
			else
			{
				ti.userWinWithdraw(winner);
			}
		}
		
	}
	
	private void setUserInit(List<UserDTO> uList)
	{
		it = uList.iterator();
		
		while(it.hasNext())
		{
			uDto = it.next();
			uDto.setBattingMoney(0);
		}
	}
	
}
