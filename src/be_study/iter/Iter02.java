package be_study.iter;

public class Iter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		  for (초기화; 조건식; 증감식) {
		   실행문;
		    }
		  
		  while(조건식) {
		   실행문; 
		   }
		   
		   
		   초기화;
		   while(조건식) {
		   실행문;
		   증감식; 
		   }
		   
		 */
		
		//단순 5번 반복
		for (int i=1; i<=5; i++) {
			System.out.println("for문 반복");
		}
		
		int i=1;
		while (i<=5) {
			System.out.println("while문 반복");
			i++;
		}
		
		i =10;
		while (true) {
			System.out.println("while(true) :" +i);
			
			i++;
			
			if(i==21)
			break;
		}
		
		i=30;
		do {
			System.out.println("조건 상관없이 일단 실행");
		}while(i<10);
		
		while(i<10 ) {
			System.out.println("일반 while문");
		}
		
		System.out.println("----------------------------");
		
		for (i=1; i<10; i++) {
			
			if (i==5)//5
				continue; //이번턴은 패스하고 다음진행으로 넘어가라
			System.out.println(i); // 1 2 3 4 5 ...
			
			if (i==8) 
				break;//그만 멈추고 나가라
			
		}
		System.out.println("----------------------------");
		
		
			
		}
		
	}


