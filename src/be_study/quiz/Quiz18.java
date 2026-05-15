package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
*/
		
		for(int i= 5; i>=1; i--) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}System.out.println();
		}
/*		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
*/
		for(int i1=1; i1<=4; i1++) {
			for(int j1=1;j1<=i1; j1++) {
				System.out.print("*");
			}System.out.println();
		}

/*      3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6 */
		System.out.println("숫자를 입력하세요");
		Scanner scanner =new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		for(int i2=1; i2<=number; i2++) {
			if(number%i2==0) {
				System.out.println(i2);
			}
		}
		
		
/*		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		* 
*/
		System.out.println("숫자입력:");
		
		int n = scanner.nextInt();
		for (int i =1; i<=n; i++) {
			for (int j= 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i= n-1; i>=n; i--) {
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
					
				
/*		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는? */

		int aSum=0;
		int bSum=0;
		
		for (int a =1; a<=10; a++) {
			aSum += a;
			bSum += aSum;
		}
	System.out.println("결과: " +bSum);
	
		
		/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.*/
		int sum6=0;
		int num6=0;
		int count6=1;
		
		while (true) {
			if(count6 %2 !=0) {
				num6=count6;
			}else {
				num6=-count6;
			}
			sum6 += num6;
			if (sum6>=100) {
				break;
			}
			count6++;
		}
		System.out.println("100이상이된 누적합 : "+sum6);
		System.out.println("마지막 : "+num6);
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
