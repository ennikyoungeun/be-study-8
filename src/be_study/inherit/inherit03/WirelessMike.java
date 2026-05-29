package be_study.inherit.inherit03;

public class WirelessMike extends Mike {
	//무선마이크
	//무선마이크는 마이크다. 
	
	//타입. 모델 가격
	//볼륨업 체크 모두 상속해서 가지고 있음
	
	//메소드 재정의(오버라이딩)
	//오버로딩- 매개변수의 개수 순서 타입을 다르게 여러개선언
	//오버라이딩-부모매소드를 한번더 덮어써서 재정의 하는것
	
	public void volumeUp() {
		System.out.println("WirelessMike 가 volumeUp() 재정의");
	}
}
