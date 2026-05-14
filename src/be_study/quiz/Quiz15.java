package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (초기화; 조건식; 증감식) { 실행문; }
		 * 
		 * while(조건식) { 실행문; }
		 * 
		 * 
		 * 초기화; while(조건식) { 실행문; 증감식; }
		 * 
		 * 
		 * while(i<10 ) { System.out.println("일반 while문"); }
		 * 
		 * System.out.println("----------------------------");
		 * 
		 * for (i=1; i<10; i++) {
		 * 
		 * if (i==5)//5 continue; //이번턴은 패스하고 다음진행으로 넘어가라 System.out.println(i); // 1 2
		 * 3 4 5 ...
		 * 
		 * if (i==8) break;//그만 멈추고 나가라
		 * 
		 * } System.out.println("----------------------------");
		 */
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.입력");
			System.out.println("2.수정");
			System.out.println("3.조회");
			System.out.println("4.삭제");
			System.out.println("5.종료");
			
			System.out.println("메뉴번호를 입력하세요:");

			int menu = scanner.nextInt();
			if (menu == 5) {
				System.out.println("프로그램이 종료됩니다");
				break;
			}
			else if (menu == 4) {
				System.out.println("삭제메뉴입니다.");
			}
			else if (menu == 3) {
				System.out.println("조회메뉴입니다.");
			}
			else if(menu == 2) {
				System.out.println("수정메뉴입니다.");
			}
			
			else if(menu == 1) {
				System.out.println("입력메뉴입니다.");
				
			} else {
				System.out.println("잘못입력하셨습니다.");

			}
		}
	}
}
