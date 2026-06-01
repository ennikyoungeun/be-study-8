package be_study.abst;

//음료
//추상클래스
public abstract class Beverage {
	
	String name;
	int ml;
	
	public void introduce() {
		System.out.println("저는 Beverage 입니다.");
	}
	
	//성분 안전검사
	//부모입장에서 실체 필요 없음 . 사용법아는것이 필요
	//자식이 이 메소드를 무조건 각자 재정의 해서 처리
	public abstract void checkSafety() ;
		//추상메소드 선언
	
	
}
