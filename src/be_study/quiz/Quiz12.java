package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//윤년이 되는 조건들?
		// 조건 1: 연도가 4로 나누어떨어지고, 100으로 나누어떨어지지 않으면 윤년입니다.
		//연도 % 4==0, 연도 %100=!0
		
		//조건 2: 연도가 400으로 나누어 떨어지면 윤년이다.
		//연도 %400 ==0
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("확인하고 싶은 연도를 입력하세요 :");
		int year =scanner.nextInt();
		
		if((year%4==0&& year % 100 != 0)||( year % 400 ==0)){
			System.out.println("윤년입니다.");
			}
			else {
			System.out.println("윤년이 아닙니다.");
		}
		
		
		}
	}


