package be_study.inherit.inherit03;

public class Mike {
	
	//마이크
	String type;
	String model;
	int price;
	
	public void volumeUp() {
		System.out.println("Mike volumeUp()");
	}
	public void check() {
		System.out.println("Mike check()기능체크");
	}
	//메소드 재정의 불가 
	public final void noMethod() {//final이 붙으면 재정의 불가능
		System.out.println("Mike noMethod()");
	}
	
	//여러메소드,,,

}
