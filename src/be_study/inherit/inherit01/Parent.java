package be_study.inherit.inherit01;

public class Parent extends GrandParent {
	
	//int money;//depult같은 패키지 접근
	//조부모한테 받은 age 필드존재
	//private int money; //자식 접근X 상속X
	//public int money;//접근가능 상속가능
	protected int money;
//	Parent(){
//		System.out.println("Parent()생성자 호출됨");
//	}
	//protected Parent(int money){
	public Parent(int money){
		System.out.println("Parent(int money)생성자 호출됨");
		this.money=money;
	}
	public void work() {
		System.out.println("열심히 일하는 중");
	}
}
