package be_study.homework.pizza;

import java.util.ArrayList;

public class Oder {
//	주문 내역별로 관리한다.
//	- 각 주문별로 피자 한개 또는 여러개를 주문할 수 있다.
//	- 여러개의 피자 주문이 가능하고, 각 주문별로 주문번호를 가진다.
//	- 어떤 고객이 시켰는지 주문한 고객정보를 가진다.
	//oder는 고객객체를 가짐
	//오더는 피자 객체 여러개를 가짐
	
	int oderNumber; //주문번호
	//Pizza pizza; 피자한개
	//Pizza[] pizzaArr;
	ArrayList<Pizza> PizzaList;
	//피자여러개
	
	//누가주문
	//어디로?
	//전화번호

//	String customerName;
//	String customerAddress;
//	String customerPhone;
	Customer custormer;//고객객체
	
	Delivery delivery;//배달원
	
	
}
