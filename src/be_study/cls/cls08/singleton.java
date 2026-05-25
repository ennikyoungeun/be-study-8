package be_study.cls.cls08;

public class Singleton {//혼자만 존재해야함

	
	//singleton singleton; //인스턴스필드변수-객체필요
	//static singleton singleton;//외부에서 접근할수있게 변경.
	//static singleton singleton =new singleton();ㄴ
	//private static Singleton singleton = new Singleton();
	private static Singleton singleton ;
	
	// private 접근제한자 ->외부에서 접근 불가
	//외부에서 생성자 호출불가->외부에서 객체 생성 불가
	//초기화는어디?
	private Singleton() {
		//singleton = new singleton();
	}
	
	//public Singleton getSingleton() {
	//public static Singleton getInstace() {	//메소드명변경
	//return this.singleton;
	//}
	

//	public static Singleton getInstace() {	//static으로 변경
//		return singleton;
//	}
	
	public static Singleton getInstance() {	//static으로 변경
		if(singleton==null) {
			singleton =new Singleton();
		}
		return singleton;
	}
	
	
	
	
	
	
}
