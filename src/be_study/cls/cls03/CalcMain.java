package be_study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		
		//인스턴스 객체 ,계산기객체 생성
		Calc c1 =new Calc();
		
		//c1. name ="내이름";
		//필드변수 접근
		//클래스 변수명.필드변수명
		
		//매소는 호출
		//클래스 변수명,메소드명();
		
		c1.powerOn(); //메소드 호출(실행)  괄호 필수
		
		//c1.powerOn(); 매개변수가 없는 powerOn이름의 메소드 호출
		//c1.powerOn =true; powerOn이라는 이름의 필드변수가 있구나
		
		c1.setOwner("나이름");
		
		Calc c2 =new Calc();
		c2.powerOn();
		c2.setOwner("다이름");
		
		//c2.sum(10, 20);
		int result1= c2.sum(10, 20); //30;
		System.out.println(result1);
		
		System.out.println(c2.sum(30,50));
		
		double result2 =(c2.divide(30, 7));
		System.out.println(result2);
		System.out.println(c2.divide(30, 7));
		
		int result3 = (int)c2.divide(30, 7);
		System.out.println(result3);
		
		c2.checkBattery();
		
		int cb = c2.checkBattery();
		System.out.println("잔여배터리 :" +cb);
		System.out.println("계산기 제조사: "+c2.madeByInfo());
		
		String info= c2.madeByInfo();
		System.out.println(info);
		
		// sunInt (10,20)
		// sumDouble(10.5,20.3)
		
		//println 메소드 오버로딩
		System.out.println(1231);    //printlnInt 
		System.out.println(29.133);  //printlnDouble
		System.out.println("문자열"); //printlnString
		System.out.println(true);   //printlnBoolean
		
		
		
		
		

	}

}
