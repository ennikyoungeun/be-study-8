package be_study.cls.cls02;

public class Phone {
	
	//필드
	
	String model;// 모델명
	int price; // 가격
	int battery;//배터리 용량
	
	
	//생성자
	//기본 생성자 Phone(){}
	
	//Phone(){}
		
	
	
	//생성자 오버로딩 매개변수의 타입, 순서, 갯수
	Phone(String model){ //String 타입 1개
		this.model = model;
		this.price =0;
		this.battery =2500;
		
		//필드 초기화
		//기타 다른 생성지 할일....
		//알콜소독
		//필름부착
		//불량검사
		//재부팅
	}
	//모델명,가격
	//String int 순서로 2개
	Phone (String model, int price) {
		this.model=model;
		this.price =price;
		this.battery =2500;
	}
	//모델명,배터리 용량
		//String int 순서로 2개
	/*
	 * Phone (String model, int battery) { } 
	 * 문법적인 제한에 걸림 똑같은 String int 순서로 2개->
	 */
	//int String 순서로 2개는 가능.
	 Phone (int battery,String model ) { 
		 this.battery=battery;
		 this.model=model;
		 this.price=0;
	 }
	 Phone (String model,int price,int battery) {
		this.model=model;
		this.price =price;
		this.battery =battery;
	 }
	
	
	//메소드

}
