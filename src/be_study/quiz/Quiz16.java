package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  //5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		    규칙 찾아보기.
	
		  1 2 2 2 2
		  3 1 2 2 2
		  3 3 1 2 2 
		  3 3 3 1 2 
		  3 3 3 3 1
		 */
			//int[][]arr = { {1,2,2,2,2},{3,1,2,2,2},{3,3,1,2,2},{3,3,3,1,2},{3,3,3,3,1}}
				int[][] arr = new int[5][5];

				for (int i = 0; i < 5; i++) {//i=0~4까지 증가
					for (int j = 0; j < 5; j++) {//j=0~4 증가
						if(i==j) {//i와j가 같으면
							arr[i][j]=1;
						}else if (i<j) {//i가 j보다 작을때.
							arr[i][j]=2;
						}else {//그외의 조건
							arr[i][j] =3;
						}
					}
				} 
		
				for (int i=0; i<5;i++) {
					for(int j =0; j<5;j++) {
						System.out.print(arr[i][j]);
					}System.out.println();
				}

}}
