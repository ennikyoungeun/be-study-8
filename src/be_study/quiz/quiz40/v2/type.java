package be_study.quiz.quiz40.v2;

public interface type {
	public static void main(String[] args) {
		//객체생성
		
		Orderable food = new Food("족발",19800);
		Orderable electronics= new Electronics("에어팟",199000);
		Orderable clothing = new Clothing("셔츠",49900);

		// 총합 계산
		int total= food.discountedPrice()
				+electronics.discountedPrice()
				+clothing.discountedPrice();
		// 결과 출력
		System.out.printf("총합:%d 원\n",total);
		}
		

}
