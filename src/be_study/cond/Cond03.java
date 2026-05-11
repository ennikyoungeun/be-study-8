package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {

		int dice =5; //1~6
		
		if (dice == 1) {
			System.out.println("1칸 전진");}
		
		if (dice == 1) {
			System.out.println("1칸 전진");}
		else {// 2~6
				System.out.println("2칸 전진");
		}
		
		if (dice == 1) {
			System.out.println("1칸 전진");}
		else if(dice == 2) {
			
		}
		else if(dice == 3) {
			
		}
		else if(dice == 4) {

		}
		else if(dice == 5) {

		}
		else {//6 일때 실행 -> 앞에 있는 케이스들이 모두 아닌경우 실행
	
		}
		
		if (dice == 1) {}
		if (dice == 2) {}
		if (dice == 3) {}
		if (dice == 4) {}
		if (dice == 5) {}
		if (dice == 6) {}

		//
		//(조건식 -> 최종적으로 true, false 논리형)
		
		if (dice > 10) {}
		
		if (dice> 0 && dice <=6) {}
		
		if (dice <1 || dice > 6) {}
		
	// switch (비교하려는 대상)	
		
		dice= 1;
		
	switch(dice) { //break를 걸어주면 해당하는 것만 실행/ break 없을땐 차례로 모두 실행
	case 1:    // if (dice==1)
		System.out.println("caes 1");
		break;
	case 2:
		System.out.println("caes 2");
		break;
	case 3:
		System.out.println("caes 3");
		break;
	case 4:
		System.out.println("caes 4");
		break;
	case 5:
		System.out.println("caes 5");
		break;
	case 6:
		System.out.println("caes 6");
		break;
	}
	switch(dice) { //break를 걸어주면 해당하는 것만 실행/ break 없을땐 차례로 모두 실행
	case 1:    // if (dice==1)
		System.out.println("caes 1");
		break;
	case 2:
		System.out.println("caes 2");
		break;
	case 3:
		System.out.println("caes 3");
		break;
	case 4:
		System.out.println("caes 4");
		break;
	case 5:
		System.out.println("caes 5");
		break;
	default: //else
		System.out.println("caes 6");
		break;
	}
	
	//------------------------------------
	
	/*출근시간 대비 할 일
	  
	  8시 청소 
	  9시 회의 
	  10시 외근 
	  11시 외근
	 */
	
	int show =8; //출근 시간
	
	if (show <= 8) {
		//청소
		//회의
		//업무
		//외근
	}else if (show <=9) {
		//회의
				//업무
				//외근
	}else if (show <=10) {
		
		//업무
		//외근
	}else if (show <=11) {
		//}else {
		//외근
	}
		
	/*switch (show) {
	case8: 
	case9:
	case10:
	case11:
		
		//default : else
		
	}
	
	switch (show) {
	case8:
	case9:
	case10:
	case11:*/
		
//	}
	
}
}
