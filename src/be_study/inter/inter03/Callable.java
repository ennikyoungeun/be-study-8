package be_study.inter.inter03;

public interface Callable {
	//기능 : 전화를 걸수잇는
	
	//전화 상태 코드 관리
	public static final int CALL_ON=1; //전화중상태
	public int CALL_OFF =2;
	
	//Callable.CALL_ON
	//Callable.CALL_OFF
	
	public void call(); //전화걸기 필수
	

}
