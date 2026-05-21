package be_study.cls.cls04;

public class IpadMain {

	public static void main(String[] args) {
		
		
		Ipad ip1 = new Ipad();
		ip1.owner = "나주인";
		ip1.showInfo();
		
		Ipad ip2 = new Ipad();
		ip2.owner = "김사장";
		ip2.showInfo();
		
		Ipad ip3 = new Ipad("최대리");
		System.out.println(ip3.owner);
		
		System.out.println(ip3.batteryNum());
		
		Ipad ip4 = new Ipad();
		ip4.showInfo(); //owner =null;
		ip4.owner="이회장"; //owner 필드변수에 값이 저장됨
		ip4.showInfo(); //owner 필드 변수값 인식
		
		ip4.returnCheck();
	}

}
