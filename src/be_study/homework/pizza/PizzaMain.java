package be_study.homework.pizza;

import java.util.ArrayList;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza p1 =new Pizza();
		p1.type="페퍼로니";
		p1.size="M";
		
		Pizza p2 =new Pizza("콤비네이션","L");
		Pizza p3 =new Pizza("고구마","S");
		Pizza p4 =new Pizza("치즈","M");
		
		System.out.println(p1.type);
		System.out.println(p2.type);
		System.out.println(p3.type);
		System.out.println(p4.type);
		
		Oder o1 = new Oder();
		o1.oderNumber=1;
		
		//초기화
		o1.PizzaList=new ArrayList<Pizza>();
		//ArrayList add();
		o1.PizzaList.add(p2);
		o1.PizzaList.add(p4);
		
		Customer c1=new Customer();
		c1.name = "이과장";
		c1.address= "박스빌딩";
		c1.phone="010-1234-1234";
		
		o1.custormer=c1;
		
		Delivery d1 =new Delivery();
		d1.name ="나배달";
		d1.company= "빠른";
		d1.isDelivering= false;
		
		//시스템 많은 배달원들 목록관리
		//비교중..
		
		if (d1.isDelivering==false) {
			d1.oder=o1; //배달에 주문을 주입
			
			o1.delivery =d1;//주문에 배달을 주입
			
			DeliveryMatch dm1= new DeliveryMatch();
			dm1.oder=o1;
			dm1.delivery =d1;
		}
		
		
	}

}
