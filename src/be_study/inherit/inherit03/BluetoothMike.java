package be_study.inherit.inherit03;

public class BluetoothMike extends Mike {
	//블루투스 마이크

	boolean isConnected;
	int battery;
	
	//병도의 각자 필요한 메소드 확장
	
	public void connect() {
		//블루트스 연결합니다.
	}
//기존에 잇던 메소드 활용->chek();
	//기존 메소드 업그레이드 -재정의
	//private void volumeUp(){메소드 재정의는 접근제한자 범위를 줄이면서 재정의 불가능
	//	퍼블릭->프라이빗 안됨}
	
	
	public void volumeUp() {
		System.out.println("BluetoothMike 가 volumeUp() 재정의");
	}
	//개별적으로 추가선언 확장
	//메소드 오버로딩
	public void volumeUp(int v) {
		System.out.println(v+"BluetoothMike 가 volumeUp(int v) 재정의");
	}
	//부모클래스 파이널 메소드 재정의 불가능
	//public void noMethod() {}
	
	
}

