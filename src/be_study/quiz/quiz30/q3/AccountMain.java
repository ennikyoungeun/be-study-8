package be_study.quiz.quiz30.q3;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount =new Account("송영은",10000);
		System.out.println("현재잔액"+myAccount.deposit(5000)+"원");//입금
		System.out.println("현재잔액"+myAccount.withdraw(2000)+"원");//출금
	}

	class AccountTest {
		public static void main(String[]args) {
			Account acc = new Account ("송영은",5000);
			//인출 상한(잔액) 이상의 금액인출
			System.out.println("최종잔액:"+acc.withdraw(100000)+"원");
		}
	
	

	}
}
