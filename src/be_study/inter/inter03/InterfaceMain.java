package be_study.inter.inter03;

public class InterfaceMain {

	public static void main(String[] args) {
		Iphone p1 =new Iphone();
		GalaxyPhone p2 =new GalaxyPhone();
		LGPhone p3= new LGPhone();
		
		Callable c1 = new Iphone();
		Callable c2 = new GalaxyPhone();
		Callable c3 =new LGPhone();
		
		Person p =new Person();
		p.callPhone=p1;
		p.call("1234");//사용법 동일 Callable
		
		p.callPhone=p2;
		p.call("1234");
		
		p.callPhone=p3;
		p.call("1234");
		
		BluetoothSpeaker bs = new BluetoothSpeaker();
		
		Connectable cc= bs;
		cc= p2;
		//cc=p1; // 아이폰은 컨넥트애이블 구현하고 있지않음
		
		Connectable cc1= new BluetoothSpeaker();
		Connectable cc2= new GalaxyPhone();
		
		
		

	}

}
