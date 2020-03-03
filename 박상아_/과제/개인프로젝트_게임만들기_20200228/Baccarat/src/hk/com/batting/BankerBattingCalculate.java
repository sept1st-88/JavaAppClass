package hk.com.batting;

import java.util.Iterator;
import java.util.List;

import hk.com.AdminDTO;
import hk.com.UserDTO;

public class BankerBattingCalculate extends BattingAbst {

	/**
	 * @param 참가자
	 * 참가자가 뱅커 진영을 선택해서 이겼을 때 받는 돈
	 */
	@Override
	public void userWinWithdraw(List<UserDTO> uDto) {
		// TODO Auto-generated method stub

		Iterator<UserDTO> it = uDto.iterator();
		UserDTO user = null;
		int battingMoney = 0;
		int money = 0;
		
		while(it.hasNext()){
			user = it.next();
			
			// 베팅금액의 최소 액수는 1만원이기 때문에 소수가 나오지 않는다. 
			battingMoney = (int)(user.getBattingMoney() * 1.95);

			money = user.getMoney() + battingMoney;		
			user.setMoney(money);
		}
		
	}

	/**
	 * @param 참가자
	 * 참가자가 뱅커 진영을 선택해서 졌을 때 잃는 돈
	 */
//	@Override
//	public void loseWithdraw(UserDTO uDto) {
//		// TODO Auto-generated method stub
//		int battingMoney = 0;
//		int money = 0;
//		
//		battingMoney = uDto.getBattingMoney();
//		money = uDto.getMoney() - battingMoney;
//		
//		uDto.setMoney(money);
//	}

	/**
	 * 운영자의 자금이 충분한가 확인
	 * @param 운영자(승리한 참가자에게 보상을 줄 금액)
	 * @return 자금이 충분히 있는가 없는가 
	 */
	@Override
	public boolean adminMoneyCheck(AdminDTO bDto) {
		// TODO Auto-generated method stub
		boolean isc = false;
		int battingMoney = 0;
		
		battingMoney = (int)(bDto.getBattingMoney() * 1.95);
		
		if(AdminDTO.getMoney() > battingMoney){
			isc = true;
		}
		
		return isc;
	}

	/**
	 * 운영자: 게임 결과 후 남은 돈 회수
	 */
//	@Override
//	public void adminMoneyGet(AdminDTO bDto) {
//		// TODO Auto-generated method stub
//		
//	}

	/**
	 * 운영자: 우승자에게 보상 제공 이후 자금 차액
	 * (뱅커가 우승시 1.95배의 금액을 보상해 주어야 한다)
	 */
	@Override
	public void adminMoneyOut(AdminDTO bDto) {
		// TODO Auto-generated method stub
		int money = AdminDTO.getMoney() - (int)(bDto.getBattingMoney()*1.95);
		AdminDTO.setMoney(money);
	}

	/**
	 *  운영자(Player, Banker)의 베팅금액 초기화
	 */
//	@Override
//	public void adminBattingMoneyInit(AdminDTO bDto) {
//		// TODO Auto-generated method stub
//
//	}

	/**
	 * 만원보다 작은 값이 존재 하나 안하나
	 * @return 존재하지 않으면 true
	 */
//	@Override
//	public boolean userBattingMoneyCheck(UserDTO uDto) {
//		// TODO Auto-generated method stub
//		boolean isc = false;
//		
//		if(uDto.getBattingMoney()%10000 == 0){
//			isc = true;
//		}
//		
//		return isc;
//	}
	
}
