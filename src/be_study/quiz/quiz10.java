package be_study.quiz;

import java.util.Scanner;

public class quiz10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = scanner.nextInt();
		System.out.print("영어점수 : ");        
		int eng = scanner.nextInt();        
		System.out.print("수학점수 : ");        
		int math = scanner.nextInt();        
		// 합격기준: 각 과목별 과락점수 40점 미만->40점 이상
		//          총평균 :60점 이상
		int total = kor + eng + math;  //총합점수
        double avg = total / 3.0;
        
         // 3. 합격 조건 판별
		// 조건: 각 과목 40점 이상 AND 평균 60점 이상
		 if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
		 // 합격 시 출력
		  System.out.println("국어 : " + kor);
		  System.out.println("수학 : " + math);
		  System.out.println("영어 : " + eng);
		  System.out.println("합계 : " + total);
		  System.out.printf("평균 : ", avg);
		  System.out.println("축하합니다, 합격입니다!");
		        } else {
		            // 불합격 시 출력
		            System.out.println("불합격입니다.");
	}

}
}