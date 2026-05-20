package be_study.cls.cls02;

public class Phone2 {
	
	//필드
	
	String model;// 모델명
	int price; // 가격
	int battery;//배터리 용량
	
	
	//생성자
	//기본 생성자 Phone(){}
	
	//Phone(){}
		
	
	
	//생성자 오버로딩 매개변수의 타입, 순서, 갯수
	Phone2(String model){ //String 타입 1개
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
	
	Phone2 (String model, int price) {
		this.model=model;
		this.price =price;
		this.battery =2500;
	}

	//필드 초기화
	//기타 다른 생성지 할일....
	//알콜소독
	//필름부착
	//불량검사
	//재부팅
	 Phone2 (int battery,String model ) { 
		 this.battery=battery;
		 this.model=model;
		 this.price=0;
	 }

		//필드 초기화
		//기타 다른 생성지 할일....
		//알콜소독
		//필름부착
		//불량검사
		//재부팅
	 Phone2 (String model,int price,int battery) {
		this.model=model;
		this.price =price;
		this.battery =battery;
	 }
	
	
	//메소드

}
