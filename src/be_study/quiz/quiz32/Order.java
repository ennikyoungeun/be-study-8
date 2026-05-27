package be_study.quiz.quiz32;

public class Order {
		// 필드(인스턴스 필드)
		int orderNum;
		Menu[] menus;
		// 생성자
		public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
		}
		// 메소드(인스턴스 메소드)
		public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
			int total =0;
			for(int i=0; i<menus.length; i++) {
				total += menus[i].price;}
			
		return total;
		}
	}
		
//		public int totalPrice() {//향상된 for문
//			/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
//				int sum =0;
//				for(Menu menu : menus) {
//					sum += menu.price;
//				}
//			return sum;
//		}


