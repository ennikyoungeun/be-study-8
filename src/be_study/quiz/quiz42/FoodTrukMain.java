package be_study.quiz.quiz42;

import java.util.Scanner;

public class FoodTrukMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        FoodTruck truck = new FoodTruck();

        Food kimbap = new Food("김밥", 1000);
        Food tteok = new Food("떡볶이", 6000);
        Food sundae = new Food("순대", 7000);

        kimbap.addStock(50);
        tteok.addStock(5);
        sundae.addStock(3);

        truck.addFood(kimbap);
        truck.addFood(tteok);
        truck.addFood(sundae);

        while(true) {

            System.out.println();
            System.out.println("***[메뉴선택]***");
            System.out.println("1.메뉴보기");
            System.out.println("2.주문하기");
            System.out.println("3.재고관리");
            System.out.println("4.마감하기");

            int menu = sc.nextInt();

            switch(menu) {

                case 1:

                    truck.showMenu();
                    break;

                case 2:

                    truck.showMenu();

                    System.out.print("주문 메뉴 번호 입력 : ");
                    int orderNo = sc.nextInt();

                    truck.order(orderNo);

                    break;

                case 3:

                    truck.showMenu();

                    System.out.print("재고 관리할 메뉴 번호 : ");
                    int stockNo = sc.nextInt();

                    System.out.print("추가할 재고 수량 : ");
                    int qty = sc.nextInt();

                    truck.addStock(stockNo, qty);

                    break;

                case 4:

                    truck.close();
                    System.exit(0);

                    break;
            }
        }
    }
}
