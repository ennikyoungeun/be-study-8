package be_study.cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 0;
		
		boolean isHungry =true;
		
		if (isHungry) {
			System.out.println("햄버거 주문");
			money += 5000;
		}
		else {System.out.println("젤리하나 추가");
			money = money +300;
		}
		
		boolean option =false;
		if (option == true) {
			System.out.println(" 패티 추가 옵션비용 발생");
			money += 2000;
		}
		else {
			System.out.println(" 옵션 없이 그대로 진행");
		}
		int coupon = 0;         // 2)인식할수있는 범위에 미리 선언
		boolean isDiscount = true;
		if( !isDiscount) {
			System.out.println(" 할인 없음");
		}
		else {
		     coupon = 500;
			System.out.println(" 할인 쿠폰 적용");
			money = money - coupon;
			// 1) 쿠폰 변수를 인식할수 있는 영역 내에서 출력
			System.out.println("적용된 쿠폰 금액:"+ coupon);
			
		}
//		System.out.println("적용된 쿠폰 금액:"+ coupon);
		System.out.println("최종금액:"+ money);
		
	}
	

}
