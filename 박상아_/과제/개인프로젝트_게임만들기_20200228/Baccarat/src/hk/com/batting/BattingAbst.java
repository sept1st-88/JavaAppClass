package hk.com.batting;

import java.util.Iterator;
import java.util.List;

import hk.com.AdminDTO;
import hk.com.UserDTO;

public abstract class BattingAbst implements IBattingInter {

	/**
	 * @param 참가자
	 * 참가자가 졌을 때 잃는 돈
	 */
	@Override
	public void userLoseWithdraw(List<UserDTO> uDto) {
		// TODO Auto-generated method stub
		Iterator<UserDTO> it = uDto.iterator();
		UserDTO user = null;
		int battingMoney = 0;
		int money = 0;
		
		while(it.hasNext()){
			user = it.next();
			
			battingMoney = user.getBattingMoney();

			money = user.getMoney() - battingMoney;		
			user.setMoney(money);
		}

	}

	/**
	 * 만원보다 작은 값이 존재 하나 안하나
	 * @return 존재하지 않으면 true
	 */
	@Override
	public boolean userBattingMoneyCheck(UserDTO uDto) {
		// TODO Auto-generated method stub
		boolean isc = false;

		if (uDto.getBattingMoney() % 10000 == 0) {
			isc = true;
		}

		return isc;
	}
	
	/**
	 * 참가자의 돈이 최소 만원 이상이면 true
	 */
	@Override
	public boolean userMoneyCheck(UserDTO uDto){
		boolean isc = false;
		
		if(uDto.getMoney() >= 10000){
			isc = true;
		}
		
		return isc;
	}

	/**
	 * 운영자: 게임 결과 후 남은 돈 회수
	 */
	@Override
	public void adminMoneyGet(AdminDTO aDto) {
		// TODO Auto-generated method stub
		int money = AdminDTO.getMoney() + aDto.getBattingMoney();
		AdminDTO.setMoney(money);
	}

	/**
	 *  운영자(Player, Banker)의 베팅금액 초기화
	 */
	@Override
	public void adminBattingMoneyInit(AdminDTO aDto) {
		// TODO Auto-generated method stub
		aDto.setBattingMoney(0);
	}

	/**
	 * 운영자(Player, Banker)의 베팅금 셋팅
	 */
	public void adminBattingMoneySet(AdminDTO aDto, List<UserDTO> uDto){
		int userBattingMoney = 0;
				
		Iterator<UserDTO> it = uDto.iterator();
		
		while (it.hasNext()) {
			UserDTO user = it.next();
			userBattingMoney += user.getBattingMoney();			
		}
		aDto.setBattingMoney(userBattingMoney);
	}
}
