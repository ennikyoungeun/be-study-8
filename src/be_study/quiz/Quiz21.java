package be_study.quiz;


import java.util.Random;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	/*	
		//3반 5명
				int[][]classes =new int[3][5];
				
				double[] avg = new double[3];
				int totalSum= 0;
				
				for (int i =0; i<classes.length; i++) {
					int classSum=0;
					System.out.println((i+1)+"반점수입력(5명): ");
					for(int j=0; j<classes[i].length; j++) {
						classes[i][j] = scanner.nextInt();
						classSum += classes[i][j];
					}
					avg[i] =(double)classSum/classes[i].length;
					totalSum +=classSum;
				}
				
				System.out.println();
				
				for (int i = 0; i<avg.length; i++) {
					System.out.println((i+1)+"반평균 : "+(int)avg[i]);
				}
				double totalAvg = (double) totalSum /(classes.length*classes[0].length);
				System.out.println("전체 평균 : "+(int)totalAvg);
		*/		
				
		/*
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		for (int i=1; i<=6; i++) {//주사위 1 :1~6
			for (int j=1; j<=6; j++) {//주사위2 :1~6
				if(i+j==6) {
					System.out.print(i+","+j);
					System.out.println("");
				}
			}
		}
	*/
		 //로또 번호 6개 랜덤하게 생성하기.
		
		int[]lotto=new int[6]; //6개의 서로 다른수  index :0 1 2 3 4 5
		//6개를 1개씩 중복체크하면서 순서대로 뽑기
		//->하나뽑기->중복체크->중복->다시->중복없음->저장후 뽑기->6개다 뽑을때까지
		//->지금 몇개까지 뽑았는지 ?->관리(별도의 변수로 ..기록, 저장)
		
		Random random = new Random();
		//while문 활용
		//흐름그대로 코드화
		
		int index=0;
		boolean isDuplicated =false;
		while(true) {
			//랜덤값 1-45뽑기
			int value=(int)(Math.random()*45)+1;
			//중복있는지 체크.
			for (int i=0; i<index; i++) { //기존 뽑힌 칸에 지금 뽑은 값이 있나 확인.
				if(lotto[i]==value) {
					isDuplicated =true;
					break;
				}
			}if(isDuplicated) {//중복있읍
				continue;
			}else {//중복X
				lotto[index]=value;
				index++;
			}if(index==6) {
				break;
			}
			
		}for(int i=0; i<=6; i++) { 
			System.out.println("로또번호 :"+lotto[i]);
		}
		
		
	
		
			
		
	
		//4
		
		int[][]arr= {{10,20,30},{20,30,40},{30,40,50}};
		
		int arri= arr.length;
		int arrj= arr[0].length;
	
		int[][]plusArr= new int[arri+1][arrj+1];
		
		for(int i=0; i<arri; i++) {
			for(int j=0; j<arri; j++) {
				plusArr[i][j]=arr[i][j];
				plusArr[i][arrj]+=arr[i][j];
				plusArr[arri][j] +=arr[i][j];
				plusArr[arri][arrj]+=arr[i][j];
			}
		}
			for (int i = 0; i<plusArr.length; i++) {
				for (int j=0; j<plusArr[i].length; j++) {
					System.out.print(plusArr[i][j]+"");
				}
				System.out.println();
			}
		}
}
		
		


