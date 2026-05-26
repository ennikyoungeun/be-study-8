package be_study.quiz.quiz28;

import java.util.Scanner;

public class WeightAfterFiveMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 홍팍이는매달0.231씩 살이 찜->현재72.4->5개월후는?
		//현재몸무게는W 개월수를 N이라할때 WN의 형식으로 입력
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		double start = scan.nextDouble();
		int after = scan.nextInt();

		// 계산
		double result = weight(start, after);

		// 결과 출력
		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
		} //소수점 뒤 2자리까지만 나오게 표현
	
		//	System.out.printf("%d개월 후 예상 몸무게 => %fkg", after, result);
		//}

		// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
		public static double weight(double currentWeight, int months) {
		double expectedWeight = currentWeight;
		for (int i=0; i<months; i++) {
		expectedWeight += 0.231;
		}
		return expectedWeight;
	}

}
