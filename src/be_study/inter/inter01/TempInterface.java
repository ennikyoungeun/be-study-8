package be_study.inter.inter01;

public interface TempInterface {
	//변수선언 ->상수로 인식
	
	int sucess=20; // 성공 상수코드
	static final int fail =500; //실패값 상수코드
		//개별 인스턴스 객체에 있는 멤버 변수가 되지 않는다. 

	
	public void method1(); //선언부분만.. 추상메소드 . 구현체(구현 클래스)에서 꼭 필수재정의해야함.
	
}
