package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int americanoCount =0;
		int latteCount =0;
		int vanillaCount =0;
		
		int totalPrice=0;
		

		while (true) {
			System.out.println("========메뉴========");
			System.out.println("1.아메리카노   3500원");
			System.out.println("2.카페라떼     4100원");
			System.out.println("3.바닐라라떼   4300원");
			System.out.println("==========-========");

			System.out.print("메뉴 선택 : ");
            int menu = scanner.nextInt();

            if (menu < 1 || menu > 3) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
                continue; 
            }
            System.out.print("수량 선택 : ");
            int count = scanner.nextInt();

            String menuName = "";
            int price = 0;
            
            if (menu == 1) {
                menuName = "아메리카노";
                price = count * 3500;
                
                americanoCount += count;
            } else if (menu == 2) {
                menuName = "카페라떼";
                price = count * 4100;
                
                latteCount += count;
            } else if (menu == 3) {
                menuName = "바닐라라떼";
                price = count * 4300;
                
                vanillaCount += count; 
            }

            System.out.println("======================");
            System.out.println(menuName + " " + count + "잔 : " + price + "원");
            System.out.println("======================");
           
            String yn = "";
            while (true) {
                System.out.print("추가 주문하시겠습니까?(y/n) : ");
                yn = scanner.next();

                if (yn.equals("y") || yn.equals("n")) {
                    break;
                }
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
            
            	if (yn.equals("n")) {
               totalPrice =(americanoCount *3500)+(latteCount*4100)+(vanillaCount*4300);
		       System.out.println("======================");
		       System.out.println("총액 : " + totalPrice + "원");
		       break;
            }
        }
        
    
	}

}
