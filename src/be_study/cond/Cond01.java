package be_study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문 if 문
				//if 조건식 -> 조건식이 참이면 실행
				
				int num =15;
				
				int x = 3;
				if ( num>5) {
					System.out.println( "num이 5보다 크다");
					System.out.println(" if문 안 {} 실행");
					
					//{} 하나의 인식되는 지역 구분
					//int x =30; // 변수 중복 사용불가
					x= 50;       // 위에 이미 int 선언 되어있음

					int y = 20;
					y= y + 50;
					y= 100;
					System.out.println(y);
	}

				x = 20;
				
				// y= 500; if 문 내부지역 만 인식되는변수
				
				int y = 5;
				
				if( num <10 ) {// 참이면 실행
					System.out.println("num이 10보다 작구나");
					System.out.println("num이 작다");
					y =10;
				}
				else {// 위쪽 조건문이 거짓이면 실행
					System.out.println("num이 10보다 작지 않다.");
				}
				
				//if (조건식)   조건식 -> 결과가 논리형 (true /false )
				
				boolean bool1 = (num !=15);
				
				if (!bool1) {// 조건식 결과가 논리형 = > boolean 논리형
					System.out.println("num 이ㅣ 15랑 같은 수");
				}
				else {System.out.println("num 이ㅣ 15랑 다른 수");
				}
				
				System.out.println("End");
				
				
	}}
	
