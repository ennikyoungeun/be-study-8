package be_study.quiz.quiz42;

import java.util.ArrayList;

public class FoodTruck {
	 private ArrayList<Food> menuList;
	    private int sales; // 매출

	    public FoodTruck() {
	        menuList = new ArrayList<>();
	        sales = 0;
	    }

	    // 메뉴 등록
	    public void addFood(Food food) {
	        menuList.add(food);
	    }

	    // 메뉴 보기
	    public void showMenu() {

	        System.out.println("------[메뉴]------");

	        for(int i=0; i<menuList.size(); i++) {

	            Food food = menuList.get(i);

	            System.out.printf(
	                    "[%d] %s : %d원 (잔여재고:%d)%n",
	                    i+1,
	                    food.getName(),
	                    food.getPrice(),
	                    food.getStock()
	            );
	        }
	    }

	    // 주문
	    public void order(int menuNo) {

	        Food food = menuList.get(menuNo-1);

	        if(food.sell()) {

	            sales += food.getPrice();

	            System.out.println(
	                    food.getName() + " 메뉴 1개 주문완료!"
	            );

	        } else {

	            System.out.println("재고가 부족합니다.");
	        }
	    }

	    // 재고 추가
	    public void addStock(int menuNo, int qty) {

	        Food food = menuList.get(menuNo-1);

	        food.addStock(qty);

	        System.out.println("재고 추가 완료");
	    }

	    // 마감
	    public void close() {

	        int wasteCost = 0;

	        for(Food food : menuList) {

	            wasteCost +=
	                    (int)(food.getPrice() * 0.3)
	                            * food.getStock();
	        }

	        int finalProfit = sales - wasteCost;

	        System.out.println("\n===== 마감 =====");
	        System.out.println("매출액 : " + sales);
	        System.out.println("폐기손해 : " + wasteCost);
	        System.out.println("최종수익 : " + finalProfit);
	    }
	

}
