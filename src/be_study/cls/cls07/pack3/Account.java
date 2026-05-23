package be_study.cls.cls07.pack3;

public class Account {

	private String name;
	private String bank;
	private double rake;
	private int balance;
	/*필드변수 까지 선언후에..
	 * 자동으로 Getter and Setter 생성하기
	  Source 메뉴 -> Generate Getter and Setter
	  ->select getters and setters to create->
	  만들 필드변수 선택-> Generate
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getRake() {
		return rake;
	}
	public void setRake(double rake) {
		this.rake = rake;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
