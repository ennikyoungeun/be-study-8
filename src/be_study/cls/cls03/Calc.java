package be_study.cls.cls03;

public class Calc {
	
	//계산기 객체
	//Calculator
	
	// 필드
	//생성자
	//매소드
	
	/*
	 
	 리턴 타입 메소드명(매개변수){
	 실행문 
	 return ...
	 }
	 
	 리턴    매개변수
	 O        O		
	 O        X
	 X        O
	 X        X
	 
	 리턴타입 : 결과로 반환할 데이터의 타입( String, int, double ...)
	 			 반환할 것이 없으면?? void
	 */
	
	//계산기 전원켜기 -> 리턴 없고 매개변수도 없음
	void powerOn() {
		System.out.println("poewr On");
		//return; // void 에서 return ->매소드 실행종료, 반복문상의 break;와 같은 역할
	}
	
	//계산기 소유자 이름등록 -> 리턴 없음. 매개변수있음 (소유자 이름전달)
	void setOwner(String name) {
		System.out.println(name+"님 소유자로 등록되었습니다.");
	}
	
	//계산 수행 ->리턴 O 매개변수O (더하기 더할숫자 전달)
	
	//↓리턴 결과값의 타입이 들어감
	 int sum(int n1,int n2) {
		int result = n1+n2;
		return result; 
	}
	 double sum(double n1,double n2) {
		double result = n1+n2;
		return result; 
	}
	 
	 
	 //메소드 오버로딩 (매개변수의타입, 순서, 개수): 매소드 호출하는 시점에 어떤 매소드인지 구분가능해야함
	 //return 타입이 다른것은 오버로딩 조건에 포함되지 않는다. 
	 
//	 String sum(int n1,int n2) { //매개변수 int int 순서로 2개 중복, 
//		 String result = n1+n2+"";
//			return result; 
//		} 잘못됨.
	 
	 //매개 변수 타입순서 개수
	 int sum(int n1,int n2,int n3) {
			int result = n1+n2+n3;
			return result; 
		}
	 
	 //나누기 
	 double divide(int x, int y) {
		 double result =(double)x/y;
		 return result;}
		 
	//리턴 O 매개변수  X
		 
	// 배터리 잔여량 확인 매소드
		 int checkBattery ( ){
			 //배터리 잔여 퍼센트
			 return 80;
		 }
		 
		 //제조사 확인 매소드
		 String madeByInfo() {
			 return "카시오";
		
	 }
	 
	 
	 
	 
	
	
	 
}
