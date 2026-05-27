package be_study.quiz.quiz30.q3;

public class Account {
	//필드선언
			private String owner;//소유주
			private long balance;
			
			//기본생성자 (가능한 모든 생성자 구현)
			public Account() {
				owner=null;
				balance=0;
			}
			//모든필드를 사용하는 생성자

			public Account( String owner, long balance) {
				this.owner= owner;
				this.balance= balance;
			}
			
			//getter와 setter의 구현
			public String getOwner() {
				return owner;
			}
			public void setOwner(String owner) {
				this.owner =owner;
			}
			public long getBalance() {
				return balance;
			}
			public void setBalance(long balance) {
				this.balance =balance;
			}
			//입금
			public long deposit(long amount) {
				//balance 계좌잔액
				this.balance += amount; //입금한금액
				return balance;// 입금후 최종금액 반환
			}
			//클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
//			출하려는 메소드를 호출하여 출력
			//인출 상한 금액은 잔액까지
			public long withdraw(long amount) { //출금
				balance-= amount;
				return balance;
			}
}
			