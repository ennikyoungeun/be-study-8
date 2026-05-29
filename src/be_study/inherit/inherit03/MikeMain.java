package be_study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mike m1= new Mike();
		m1.type="마이크";
		m1.volumeUp();
		m1.check();
		
		WirelessMike m2 =new WirelessMike();
		m2.type="무선마이크";
		m2.check();
		m2.volumeUp();
		
		BluetoothMike m3 =new BluetoothMike();
		m3.type="블루투스 마이크";
		m3.isConnected=false;
		m3.battery=50;
		
		System.out.println("------BluetoothMike m3---");
		m3.check(); //기존메소드
		m3.volumeUp();//재정의한 매소드 활용
		m3.volumeUp(5);;//새로 만든 매소드 활용
		m3.noMethod();
		
	}

}
