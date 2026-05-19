package be_study.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23lv2 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
		//탑승 요청인원수 입력
		System.out.println("탑승인원 입력 : ");
		 int people = scanner.nextInt();
		//최대 정지 횟수 입력
		 System.out.println("엘리베이터 최대정지횟수:");
		 int maxStop=scanner.nextInt();
		
		 
		 //최대 정원입력
		System.out.println("엘리베이터 최대 정원 입력 : ");
		int maxPeople =scanner.nextInt();
		
		//최대 무게 입력
		System.out.println("엘리베이터 최대 무게 입력 : ");
		int maxWeight =scanner.nextInt();
		//층배열
		 int[]floors= new int[people];
		//몸무게 배열
		 int[]weights=new int[people];
		 
		 //랜덤 데이터 생성
		 System.out.println("\n=======승객정보=======");
		
		 for (int i=0; i<people; i++) {
			 //랜덤층(2-100)
			 floors[i] = (int)(Math.random()*99) +2;
			 
			 //랜덤몸무게(40-150)
			 weights[i] = (int)(Math.random()*111) +40;
			 System.out.println( (i+1)+"번승객->"+floors[i]+"층/"+weights[i]+"kg");
		 }
		 //실제 가능한 탑승인원수
		 int boardedCount =0;
		 
		 //현재 총 무게
		 int totalWeight = 0;
		 
		 System.out.println("\n=======탑승=======");
		 
		 for (int i =0; i<people; i++) {
			 //정원초과시
			 if(boardedCount>=maxPeople) {
				 System.out.println( (i+1)+"번승객 : 정원 초과로 탑승불가" );
				 break;
			 }
			 //무게초과
			 if (totalWeight + weights[i] > maxWeight) {
				 System.out.println( (i+1)+"번승객 : 무게 초과로 탑승불가" );
				 break;
			 }
			 //탑승가능
			 totalWeight +=weights[i];
			 boardedCount++;
			 
			 System.out.println((i+1)+"번승객 : 탑승완료");
			 
		 }
		 
		 //실제 탑승 인원 층 저장
		 int[]boardedFloors=new int[boardedCount];
		 
		 for(int i= 0; i<boardedCount; i++) {
			 boardedFloors[i] =floors[i];
	}
		 //층정렬
		 Arrays.sort(floors);
		 
		 int currentFloor=1; 
		 
		 int stopCount =0;//현재 멈춘 횟수
		 
		 //위로이동
		 for( int floor:boardedFloors) {
			 
			 //최대 멈춤횟수 채우면 운행중지,
			 if(stopCount==maxStop) {
			
				 System.out.println("현재"+currentFloor+ "층 점검중,운영중지");
				 System.out.println("계단으로 이동하세요.");
				 
				 break;
			 }
			 if(floor > currentFloor ){
				 for (int i=currentFloor+1; i<=floor; i++) {
					 System.out.println(i+"층도착");
				 }
				 currentFloor=floor;
				 System.out.println(floor+">>하차");
				 
				 //정지횟수추가
				 stopCount++;
				
				 
			 }
		 }
		 //정지제한에 걸리지 않는경우-> 100까지 이동
		 if(stopCount<maxStop) {
		 for(int i=currentFloor+1; i<=100; i++) {
			 System.out.println(i+"층도착");
		 }System.out.println("100층도착");
		
		 for(int i=99; i>=1; i--) {
			 System.out.println(i+"층도착");
		 }System.out.println("1층도착");
		 }
	}

}
