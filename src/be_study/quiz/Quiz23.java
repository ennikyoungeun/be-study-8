package be_study.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//엘리베이터
		/*- 기본 문제
		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
		(오로지 한번에 100층까지 쭉)
		(100층을 찍고 다시 1층까지 내려와야함)

		+ 탑승 인원을 입력받습니다.
		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		(
		* 입력된 층은 중복되지 않게 입력이 된다고 가정
		예시)
		[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
		[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
		)
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("탑승인원 입력 : ");
		 int people = scanner.nextInt();
		
		 //내릴층
		 int[]floors= new int[people];
		 System.out.println("내릴층 입력(2층-100층):");
		 
		 for (int i=0; i<people; i++) {
			 floors[i]=scanner.nextInt();
		 }
		 Arrays.sort(floors);
		 
		 int a=1;
		 
		 for( int floor:floors) {
			 if(floor > a ){
				 for (int i=a+1; i<=floor; i++) {
					 System.out.println(i+"층도착");
				 }
				 a=floor;
				 System.out.println(floor+"하차");
			 }
		 }
		 for(int i=a+1; i<=100; i++) {
			 System.out.println(i+"층도착");
		 }
		
		 for(int i=99; i>=1; i--) {
			 System.out.println(i+"층도착");
		 }
		 
		 
		 
	}

}
