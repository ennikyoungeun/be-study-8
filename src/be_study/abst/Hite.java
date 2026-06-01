package be_study.abst;

public class Hite extends Beverage {

	double alcol;
	
	public void checkAlcol() {//확장
		System.out.println("Hite 알콜도수확인");
	}
	//무조건 상속된 추상메소드 구현해야함. 
	public void checkSafety() {
	 System.out.println("알콜 도수 문제 확인");
	}
}
