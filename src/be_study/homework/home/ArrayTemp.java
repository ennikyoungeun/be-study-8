package be_study.homework.home;

import java.util.Arrays;

public class ArrayTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		🔹 1단계: 기본 배열 연습 (1~10)
		
//		1. 정수 배열을 만들어 모든 요소를 출력하라.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------");
	
//		2. 길이 5짜리 int 배열을 만들고 2번 인덱스에 50을 넣어라.
		int[]arr2=new int[5];
		arr2[2]=50;
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("---------");
		
//		3. 배열의 길이를 출력하라.
		System.out.println("3.배열의 길이출력: "+arr2.length);
		
//		4. 배열 요소들의 합계를 구해라.
		int sum= 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("4. 배열요소들의 합: "+sum);
//		5. for 문으로 배열 요소들을 출력하라.
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	
	
//		6. int 배열을 매개변수로 받아 평균을 구하는 메서드를 만들어라.
		 int[]arr6= {10,20,30,40,50};
		 int sum6 = 0;
		 
			for(int i=0; i<arr6.length; i++) {
				sum6 +=arr6[i];
			}
			double avg6= (double)sum6/arr6.length;
			
			System.out.println("6.평균: "+avg6);
//		7. 배열을 전달받아 가장 큰 값을 리턴하는 메서드를 만들어라.
			int[] arr7 = {12, 54, 23, 89, 45};
			int max =arr7[0];//제일큰값을 0덱스기준으로 시작
			
			for (int i=1; i<arr7.length; i++) {
				if(arr7[i]>max) {
					max= arr7[i]; //더큰값이면 인덱스값 교체
				}
			}
			System.out.println("7.가장큰값 : "+ max);
			
//		8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
			int[] arr8 = {10,11,13,15,40};
			System.out.println(Arrays.toString(arr8));
			for (int i=0; i<arr8.length; i++) {
				arr8[i]++;
			}
			System.out.println("8-1추가: "+Arrays.toString(arr8));
//		9. 배열을 생성하는 메서드를 만들어라(길이를 받아서 0으로 채워진 배열 리턴).
			int length9 = 5;
			int[]arr9 = new int[length9];
			System.out.println("9..길이를 받아서 0으로 채운배열: "+Arrays.toString(arr9));
//		10. 배열을 전달하면 역순으로 뒤집어주는 메서드를 만들어라.
			
			int[] arr10 = {1, 2, 3, 4, 5};
	        int[] reversedArr = new int[arr10.length]; // 뒤집은 값을 담을 새 배열
	        
	        for (int i = 0; i < arr10.length; i++) {
	            reversedArr[i] = arr10[arr10.length - 1 - i];
	        }
	        
	        System.out.println("10..원본 배열: " + Arrays.toString(arr10));
	        System.out.println("뒤집힌 배열: " + Arrays.toString(reversedArr));
	        System.out.println("----------------------------------------");
	}
}


