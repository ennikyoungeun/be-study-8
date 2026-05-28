package be_study.quiz.quiz34;

import java.util.ArrayList;

public class Kitchen {

	//주방공간
	//- 공간이 몇평인지
	//- 벽지색상이 어떤지
	//- 층고가 얼마나 되는지
		
		int floorSpace; //몇평 30평 50평
		String wallColor; //벽지색상
		int floorHeight; // 층고높이   단위?  2.5m  250cm  2500mm   1200mm
		
		//주방에 냉장고
		Refrigerator refrigerator;
		
		GasRange gasRange; //가스렌지
		
		Sink sink; //주방에 싱크대
		
		//TrashCan trashCan; //주방에 쓰레기통 한개
		//TrashCan[] trashCan;
		ArrayList<TrashCan> trashCanList;  //주방에 쓰레기통이 여러개
		
		ArrayList<Cup> cupList;  //주방에 컵 여러개
	// ArrayList<TrashCan>trashCans=new ArrayList<>();
	
	 //ArrayList<Cup>cup=new ArrayList<>();

}

/*
 * 주방공간 - 공간이 몇평인지 - 벽지색상이 어떤지 - 층고가 얼마나 되는지
 * 
 * 냉장고 - 어느 브랜드인지 - 몇리터 짜리인지 - 전원을 켤수 있다 
 * - 온도조절을할수있다(온도 up 또는 온도 down) - 문이 몇개인지
 *
 * 냉동실안에 얼음 트레이 - 몇구짜리인지 - 얼마인지
 * 
 * 가스렌지 - 화구가 몇인지 - 어디 브랜드인지 - 가격이 얼마인지 - 불을 켠다 - 불을 끈다 - 불세기르 조절한다.
 * 
 * 싱크대 - 가로, 세로, 깊이 사이즈 - 색상 - 재질
 * 
 * 쓰레기통 (*주방에 여러개가 있다) - 몇리터 - 색상 - 용량이 몇퍼센트나 찼는지 - 쓰레기를 채운다 - 쓰레기통을 연다 - 쓰레기통을
 * 닫는다 - 쓰레기통을 비운다
 * 
 * 컵 (*주방에 여러개가 있다) - 용량 - 재질 - 색상
 */


