package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		int num =scanner.nextInt();
		if(num%2==0){
			System.out.println("even");
			}
			else {
			System.out.println("odd");}
		
		System.out.println("숫자를 입력하세요 :");
		int number =scanner.nextInt();
		if(number%7==0){
			System.out.println("7의배수입니다.");
			}
			else {
			System.out.println("아닙니다.");}
		
		 
//		1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		num=1; 
		int sum=0;
				
	       for( num=1; num<=1000; num++ ){
	   	   if (num%5==0) 
	   	   sum+= num;}
		    	   System.out.println("3번.5의 배수들의 합"+sum);
		    	   
//	   1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기. ex) 입력 : 10 결과 : **********
		System.out.println("1~50 사이의 숫자를 입력하세요");
		int star =scanner.nextInt();
		
		if(star>=1 && star<=50) {
			for( int i =0; i<star; i++ ) {
				System.out.print("*");
			}
		}
		System.out.println();
		    	   
//	   1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력
		int eve =0;
		for (int i=1; i<=10; i++) {
			if(i%2 != 0) {
				eve +=i;
				}
			else {
				eve -=i;
				}
			}System.out.println("5번."+eve);
/*
 정수를 1부터(1+2+3+4.....) 계속 누적으로 더한다. 이런 패턴으로 누적으로 더해진 누적 값이 1000 보다 작으면 계속
더하고 1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
*/		sum=0;
		num=1;
		while(true) {
			sum += num;
			if(sum<1000) {
				num++;
				continue;
			}
			if(sum>1000) {
				break;
			}
			
		}
		System.out.println("6번.멈출때의 누적값: " +sum);
		
//7. 입력 받은 수의 구구단 출력 (1~9까지 입력) ex) 입력 3-> 3 * 1 = 3 3 * 2 = 6 3 * 3 = 9 ... 3 * 9 = 27
		System.out.println("7.숫자를 입력하세요 :");
		int n =scanner.nextInt();
		
		for (int i =1; i<=9; i++) {
			System.out.println(n+"*"+i+"="+(n*i));
//			System.out.printf("%3d*%3d=%3d\n" , n,i,(n*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
