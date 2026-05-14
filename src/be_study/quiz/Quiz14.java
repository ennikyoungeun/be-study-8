package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		// 몇번째 수인가요? : 그에 해당하는 수를 출력 ex) 10 20 30 50 90
		// 몇번째 수인가요? 5
		// 결과 : 90

		Scanner scanner = new Scanner(System.in);

		int[] nums = new int[5]; // 5개정수 int 배열선언.
		System.out.println("5개 정수를 입력하세요. : ");

		for (int i = 0; i < 5; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("몇번째 수인가요?");
		int index = scanner.nextInt();
		
		//index = 입력받은 순서 -1
		System.out.println("결과 :" + (nums[index - 1]));

		// 2. +자연수 (정수) 5개의 수를 차례대로 입력 받는다. 받은후에 순서를 거꾸로 출력하세요.
		// ex) 1 2 3 4 5 결과 : 5 4 3 2 1

		int[] nums1 = new int[5];
		for (int i = 0; i < 5; i++) {
			nums1[i] = scanner.nextInt();
		}
		System.out.println("결과 :");
		for (int i = 4; i >= 0; i--) {
			System.out.print(nums1[i] + "  ");
		}
		System.out.println("");
		// 3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		// (*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		// 13 14 15 16
		int[][] arr = new int[4][4];

		int sum = 1; // 배열에 값 저장
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sum++;
			}
		}

		// 배열 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}

	}
}
