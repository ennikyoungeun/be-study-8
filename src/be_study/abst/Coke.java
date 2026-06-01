package be_study.abst;

public class Coke extends Beverage  {
	
	int sugar ;// 당분
	
	public void introduce() {//재정의
		System.out.println("저는 Coke 입니다.");
	}

	@Override
	public void checkSafety() {
		//public abstract void checkSafety() ; 추상메소드구현
		System.out.println("당분 함량 확인");
		
	}

}
