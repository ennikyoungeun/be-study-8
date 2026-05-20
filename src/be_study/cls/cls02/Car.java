package be_study.cls.cls02;

public class Car {
	
	// 필수(속성변수)
	String model;  //모델명   		기본값 null
	String color;	//차량색상		      null
	int price;		//차량 가격              0
	
	//생성자 (생성할때 초기화 할일..)
	// new 클래스명(); 호출
	
	//생성자를 아무것도 만들기 않으면? ->기본생성자추가
	//Car(){//기본생성자 }
	
	Car(){ 
		//매개변수가 없는 생성자
		//클래스 명과 동일
		//객체 생성 하면서 초기에 할일
		// 필드초기화 (필드변수에 초기값 셋팅)
		System.out.println("Car() 생성자 호출됨");
		color = "green";
		model = null;
		price = 0;
	}
	
	Car(String _model) { //new Car("소나타");
		System.out.println("Car(String_model) 생성자 호출됨");
		model= _model;
		
		// 이 생성자를 통해 개체자 만들어지는 과정
		//매개 변수 전달은 _model 에 들어있는 값으 
		// 객체의 필드변수 model에 저장한다
	}
	//매개 변수가 2개인 생성자
	Car(String model,String color) {
		System.out.println("Car(String model,String color)생성자 호출됨");
	
	// 매개변수로 전달된 값 -> 필드변수에 저장
		
		this.model = model;
		//필드-모델  = 매개변수-모델 ;
		this.color = color;
		
		//this.price =10000000; //이름이 겹치면 this.변수명->필드변수로 인식
		//price = 10000000; //변수명 이름이 겹치지 않으면 그냥써도 필드변수로 인식
		
	}
	
	
	
	//메소드(기능 동작)

}
