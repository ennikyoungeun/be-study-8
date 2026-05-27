package be_study.quiz.quiz30.q4;

public class Computer {
//	//4.
//	다음을 만족하는 클래스 Computer를 작성하시오.
//	· 다음을 상수 필드로 선언
//	public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	
	//상수형 변수 코드기준값 역할
	public static final String[]Os_Type = {"윈도우10", "애플 OS X", "안드로이드"};
	
	private int osIndex;// 0 1 2 ostype-indx
	private int memory;//메인메모리값 16 32 16
//	· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성
//	자와 메소드 구현
//	Computer pc = new Computer(0, 16);
//	Computer apple = new Computer(1, 32);
//	Computer galaxy = new Computer(2, 16);
//	pc.print();
//	apple.print();
//	galaxy.print();
//	운영체제: 윈도우10, 메인메모리: 16
//	운영체제: 애플 OS X, 메인메모리: 32
//	운영체제: 안드로이드, 메인메모리: 16
	//생성자: 운영체체 인덱스와 메모리 용량을 받음
	public Computer(int osIndex, int memory) {
		this.osIndex =osIndex;
		this.memory =memory;
	}
	//결과 출력을 위한 프린트 메소드
	/*
	  public void print() { //리턴 타입이 없음.
	  System.out.println("운영체제: "+Os_Type[this.osIndex]+",메인메모리:"+this.memory); }
	 */
	public void print() { //리턴 타입이 없음.
		System.out.printf("운영체제: %s,메인메모리:%d/n",Os_Type[osIndex],memory);
	}
}
