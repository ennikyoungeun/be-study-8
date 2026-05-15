package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1.
		2x + 4y = 10 이 만족하는 
		모든 x, y 쌍을 구하시오.
		(x와 y는 자연수 1~10)*/
		for( int x= 1; x<=10; x++) {
			for(int y =1; y<=10;y++) {
				if((2*x)+(4*y)==10)
					
	  	System.out.println("("+x+","+y+")");
				
			}
		}

	/*	2.
		정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수*/
		Scanner scanner =new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		int result =(number1 > number2)?(number1-number2):(number2-number1);
		
		System.out.println(result);

		
		
	/*   3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		ex) 입력 0 0 1 0
		결과 도
		입력 0 1 0 1
		결과 개           */
		
		String input = scanner.next();
		
		int sum=0;
		for (int i=0; i<4; i++) {
			sum+= input.charAt(i)-'0';
		}
		String[]results= {"모","도","개","걸","윷"};
		if (sum>=0 && sum<=4) {
			System.out.println(results[sum]);
		}
		
		

/*		4. 입력받은 수 만큼 별 출력하기
		ex) 4
		****
		5
		*****
*/
		int n = scanner.nextInt();
		
		for (int i =1; i<=n; i++) {
			System.out.print("*");
		}
		
}
}
