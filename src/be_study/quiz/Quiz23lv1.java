package be_study.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23lv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
		
		//사람수
		System.out.println("탑승인원 입력 : ");
		 int people = scanner.nextInt();
		//정지값
		 System.out.println("엘리베이터 최대정지횟수:");
		 int maxStop=scanner.nextInt();
		
		 //내릴층
		 int[]floors= new int[people];
		 System.out.println("내릴층 입력(2층-100층):");
		 
		 for (int i=0; i<people; i++) {
			 floors[i]=scanner.nextInt();
		 }
		 Arrays.sort(floors);
		 
		 int a=1;
		 int stopCount =0;//현재 멈춘 횟수
		 
		 for( int floor:floors) {
			 //최대 멈춤횟수 채우면 운행중지,
			 if(stopCount==maxStop) {
				 System.out.println("현재"+a+ "층 점검중,운영중지");
				 System.out.println("계단으로 이동하세요.");
				 
				 break;
			 }
			 
			 if(floor > a ){
				 for (int i=a+1; i<=floor; i++) {
					 System.out.println(i+"층도착");
				 }
				 a=floor;
				 System.out.println(floor+">>하차");
				 
				 stopCount++;
				
				 
			 }
		 }
		 //정지제한에 걸리지 않는경우-> 100까지 이동
		 if(stopCount<maxStop) {
		 for(int i=a+1; i<=100; i++) {
			 System.out.println(i+"층도착");
		 }System.out.println("100층도착");
		
		 for(int i=99; i>=1; i--) {
			 System.out.println(i+"층도착");
		 }System.out.println("1층도착");
		 }
		 
	}

}
