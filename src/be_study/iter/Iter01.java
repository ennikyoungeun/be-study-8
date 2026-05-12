package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문 Iteration
		
				System.out.println("배고프다");
				//...
				//...
				//...
				//...
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				System.out.println("배고프다");
				
			
				// for문  반복문
				
				/*
				
				for(초기화식; 조건식; 증감식){
					실행문;
				}
				 */

				
				// i: 1 2 3 4 5 6 7 8 9 10      11  
				
				for(int i=1; i<=10; i++) {			
					System.out.println("재밌다");
				}
				
				System.out.println("for문 끝남");
				
				//int i=5;
				
				/*
				
				int i=1;
				
				if( i<=10 ){
					System.out.println("재밌다");
				}
				i++;
				
				if( i<=10 ){
					System.out.println("재밌다");
				}
				i++;
				
				if( i<=10 ){
					System.out.println("재밌다");
				}
				i=i+1;
				
				.......
				
				// i: 11
				if( i<=10 ){ //거짓!
					System.out.println("재밌다");
				}
				반복문 끝.
				
				그 반복문 끝난 다음 줄에 있는 코드 순서대로 또 진행...

				 */
				
				int i=0;
				
				// i:1 2   |    3
				for(i=1; i<3; i++) {
					System.out.println("피곤하다");
				}
				
				// i:35 36 37 38 39 40 41 42 43 44      |    45
				//		  45<45
				for(i=35; i<45; ++i) {   // i=i+1) {   //10번 반복
					System.out.println("for 실행문");
				}
				
				System.out.println(i);  //45
				
				//단순 몇회 반복 용도

				//-----------------------------
				
			for (i=10; i<15; i++) {
				System.out.println("다이어트 1일차");
			}
			for (i=10; i<15; i++) {
			System.out.println("다이어트 1일차");
			System.out.println("다이어트 2일차");
			System.out.println("다이어트 3일차");
			System.out.println("다이어트 4일차");
			System.out.println("다이어트 5일차");
			}

	//-----------------------------
			System.out.println("---------------");
			
	//내부에 있는 실행문에서 활용할 목적으로 값을 조정 -> 반복문 사용
	
	//i:12345  ||6거짓
	for (i=1; i<6; i++) {
		System.out.println("다이어트" +i +"일차");
		
		//      다이어트 1 일차
		//      다이어트 2 일차
		//      다이어트 3 일차
		//      다이어트 4 일차
		//      다이어트 5 일차
		
	}
	System.out.println("---------------");
	
	// 숫자의 총합
	
	int number = 1+2+3+4+5; //+678...
	
	number =number +1;
	number =number +2;
	number =number +3;
	number =number +4;
	number =number +5;
	
	int sum =0;  //덧셈연산에 영향을 주지 않는 값 0 으로 초기화.
	
	// n : 1 2 3 4 5    |6
	for(int n=1; n<=5; n++) {
		
	 //sum :0
		sum= sum +n;
	       //  0+1 ->1
		   //   1+2 ->3
	       //   3+3 -> 6
	       //   6+4 ->	10       
	       //   15+5 -> 15
	}
	System.out.println("총 누적 합 :" + sum);
	
	// 누적합
	//10 20 30 40 50...100의 합

	int total =0;
	// 반복문 기준값:1 2 3 4 5 6 7 8 9 10
	// 더해야 하는값:10 20 30 40 50 60 70 80 90 100
	//기준값 *10
	
	for(int j=1; j<=10; j++) {
		total = total + (j *10);
	}
	System.out.println("total 누적 합 :" + total);
	
	total = 0;
	//값의 변화 10 20 30 ...100
	//        +10 +20 +30 ...
	for (int j= 10; j <=100; j=j+10) {
		total =total +j;
	}
	System.out.println("total 누적 합 :" + total);
	
	
	
	
	
	
	
	
	}
}

