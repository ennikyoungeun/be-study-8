package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.
	
		//1.
		int arr [][]= new int [4][4];
		int num=1;
		
		for (int i =0; i<4; i++) {
			for (int j =0; j<4; j++) {
				arr[i][j] =num++;
			}
		}
		for (int i =0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		//2	  
		int arr2 [][]= new int [4][4]; int num2=1;
		 
		
		for (int j2 =0; j2<4; j2++) {
			for (int i2 =0; i2<4; i2++) {
				arr2[i2][j2] =num2++;
			}
		}
		for (int i2 =0; i2<4; i2++) {
			for (int j2=0; j2<4; j2++) {
				System.out.print(arr2[i2][j2]+" ");
			}
			System.out.println();
		}System.out.println("------------------");
		
		
		//3
				int arr3 [][]= new int [4][4];
				int num3=16;
				
				for (int i3 =0; i3<4; i3++) {
					for (int j3=0; j3<4; j3++) {
						arr3[i3][j3]=num3--;
						System.out.print(arr3[i3][j3]+" ");
					}
					System.out.println();
				}
				System.out.println("------------------");
		
		//4
				  int arr4 [][]= new int [4][4]; 
				  int num4 = 16;
					 
					for (int j4 =0; j4 < 4; j4 ++) {
						for (int i4=0; i4<4; i4++) {
							arr4[i4][j4] = num4--;
						}	
					}for (int i4 =0; i4<4; i4++) {
						for( int j4=0; j4<4; j4++) {
							System.out.print(arr4[i4][j4]);
						}System.out.println();
					}
					System.out.println("------------------");
						
		
	}

}
