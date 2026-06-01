package be_study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		//인터페이스는 자체적인 객체 생성불가
		//TempInterface ti = new TempInterface();
		
		TempObject t1 =new TempObject ();
		t1.method1();
		System.out.println(t1.sucess);
		System.out.println(t1.fail);
		
		
		System.out.println(TempInterface.sucess);//상수 사용 접근 방식
		System.out.println(TempInterface.fail);
		
		//부모타입 변수 =자식객체변수
		//인터페이스 타입 변수 = 구현한 객체변수
		TempInterface t2 =new TempObject();
		t2.method1();
		
		TempInterface[]tArr = { new TempObject(), new TempObject() };
		
		TempObject t3 =(TempObject)t2;// 강제 타입변환
		t3.method1();
		t3.method99();
		
		TempInterface t10 = new TempObject();
		TempInterface2 t11 = new TempObject();
		
		t10.method1();
		
		t11.method2();
		t11.method3();
		
		/*
		 * 정리!
		 
		 >클래스 상속
		 	-부모클래스 객체생성 가능 
		 	-필드변수 선언가능
		 	-메소드 구현 
		 	-부모 타입 변수= 자식객체
		 	-상속선언 1개만 가능
		 	-A is a B
		 	
		 >추상클래스 상속
		 	-부모 클래스 객체생성 불가능
		 	-필드변수 선언 가능
		 	-메소드 구현+ 추상메소드 선언
		 	-추상 부모타입 변수+ 자식객체
		 	-상속선언 1개만 가능
		 	-A is a B
		 
		>인터페이스 구현!!!!!
			- 인터페이스 객체 생성 불가능
			-필드 변수 선언 불가능-> 변수는 전부 상수화(Static final)
			-추상메소드 선언 (abstract)
		 	-인터페이스 타입 변수 = 구현 객체
		 	-인터페이스 구현 여러개 (N개)
		 	-인터패이스는 인터패이스를 다중상속가능
		 	-A has a B
		 	
		 >>>>>>>공통 특징
		 		다형성 : 동일한 사용법 -> 다른 수행결과
		 		매개변수, 리턴타입 다형성 
		 				
		 */
		
		
	}

}
