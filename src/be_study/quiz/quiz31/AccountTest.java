package be_study.quiz.quiz31;

public class AccountTest { //퍼블릭 클래스는 파일명하고 똑같아야함

	public static void main(String[] args) {
//		주어진 코드로 a에서b로 계좌 이체를 하려한다
//		main()메소드는 매회 3천원씩 더송금할수 없을때까지 이체를 진행하는 시나리오
		
		// 객체 생성
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);

		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		while (result) {
		result = a.transfer(b, 3000);
		}

		// 결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
		}
		


}
