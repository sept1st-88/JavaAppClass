package hk.com;

/**
 * 바카라 참가자 정보
 * @author SevenLeaf
 *
 */
public class UserDTO {
	
	// 게임 참가자 이름
	private String name;
	// 보유금
	private int money;
	// 베팅 금액
	private int battingMoney;
	// 카드 진영 선택 (1.Player, 2.Banker, 0.Tie(무승부))
	private int choice;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public UserDTO(String name, int money, int battingMoney, int choice) {
		super();
		this.name = name;
		this.money = money;
		this.battingMoney = battingMoney;
		this.choice = choice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBattingMoney() {
		return battingMoney;
	}

	public void setBattingMoney(int battingMoney) {
		this.battingMoney = battingMoney;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", money=" + money + ", battingMoney="
				+ battingMoney + ", choice=" + ((choice==1) ? "PLAYER" : (choice==2 ? "BANKER" : "TIE") )+ "]";
	}
	
	
	
}
