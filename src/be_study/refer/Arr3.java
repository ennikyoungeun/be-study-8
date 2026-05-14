package be_study.refer;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {1,2,3};
		
		//       ㅁㅁㅁ
		// 		  123
		//index-> 012
		
		//arr[0] <----int 타입변수
		
		System.out.println(arr1[0]==arr1[0]);
		System.out.println(arr1[0]==arr1[2]); //값 ==값
		
		String[]arr2 = {"A","B","c"};
		
		System.out.println(arr2[0]== arr2[2]); //주소비교	
		//                   String   String
		//                   참조주소    참조주소
		//                     "A"      "c"
		System.out.println(arr2[0].equals(arr2[2]) );
		 
		String [][] arr3 = { {"A","B","C"},{"D","E","F"} };
		
		// a b c
		// d e f
		
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		
		System.out.println(arr3[0]==arr3[1]);             //주소비교
		System.out.println(arr3[0][0]==arr3[1][1]);        //주소비교
		System.out.println(arr3[0][0].equals(arr3[1][1])); //값비교
		
		int[][] arr4 = {{1,2,3},{4,5,6}};
		System.out.println(arr4[0]==arr4[1]);            //주소비교
		System.out.println(arr4[0][0]==arr4[1][1]);      //값비교
		
		
		
		
		
		
	}

}
