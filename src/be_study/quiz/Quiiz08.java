package be_study.quiz;

import java.util.Scanner;

public class Quiiz08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("출생년도를 입력하세요");
		int year = scanner.nextInt();
		
		System.out.println("주민번호 뒷자리 첫번째 숫자를 입력하세요.");
		int num = scanner.nextInt();
		
		int age =2026- year + 1;
		if (year >= 2000) {
			if (num==3) {System.out.println("결과:" + age +"살 남자입니다.");}
			else if (num==4) {System.out.println("결과:" + age +"살 여자입니다.");}
			
			else {System.out.println("잘못된 결과 입니다.");}
		}
		
		else { 
			if (num==1) {
				System.out.println("결과:" + age +"살 남자입니다.");}
		    else if (num==2) {
				System.out.println("결과:" + age +"살 여자입니다.");
				}
		    else {
				System.out.println("잘못된 결과 입니다.");
			}
			}
	
}
}
		
		
	


