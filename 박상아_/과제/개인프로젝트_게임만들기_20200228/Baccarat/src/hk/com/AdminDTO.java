package hk.com;

/**
 * 바카라 진행자 정보
 * @author SevenLeaf
 *
 */
public class AdminDTO {

	// 운영자가 가지고 있는 재산 1천만
	private static int money = 10000000;
	
	// Player, Banker(진영선택 이름)
	private String name; 
	// 첫번째 카드
	private String firstCard;
	// 두번째 카드
	private String secondCard;
	// 세번째 카드
	private String thirdCard;
	// 카드들의 합  0 ~ 9 숫자가 9에 가까울 수록 좋음 
	private int score;
	// 카드 2장이 Stand, Natural, Normal 어떤건지
	private String rule;		
	
	// 베팅 총 금액
	private int battingMoney;
	
	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public AdminDTO(String name, String firstCard, String secondCard,
			int battingMoney) {
		super();
		this.name = name;
		this.firstCard = firstCard;
		this.secondCard = secondCard;
		this.battingMoney = battingMoney;
	}


	public AdminDTO(String name, String firstCard, String secondCard,
			String thirdCard, int score, int battingMoney) {
		super();
		this.name = name;
		this.firstCard = firstCard;
		this.secondCard = secondCard;
		this.thirdCard = thirdCard;
		this.score = score;
		this.battingMoney = battingMoney;
	}

	
	
	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		AdminDTO.money = money;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstCard() {
		return firstCard;
	}
	public void setFirstCard(String firstCard) {
		this.firstCard = firstCard;
	}
	public String getSecondCard() {
		return secondCard;
	}
	public void setSecondCard(String secondCard) {
		this.secondCard = secondCard;
	}
	public String getThirdCard() {
		return thirdCard;
	}
	public void setThirdCard(String thirdCard) {
		this.thirdCard = thirdCard;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getBattingMoney() {
		return battingMoney;
	}
	public void setBattingMoney(int battingMoney) {
		this.battingMoney = battingMoney;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}

	@Override
	public String toString() {
		return "AdminDTO [name=" + name + ", firstCard=" + firstCard
				+ ", secondCard=" + secondCard + ", thirdCard=" + thirdCard
				+ ", score=" + score + ", battingMoney=" + battingMoney + "]";
	}

	
	
	
	
}
