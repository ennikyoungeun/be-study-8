package be_study.quiz.quiz42;

public class Food {
	 private String name;
	    private int price;
	    private int stock;

	    public Food(String name, int price) {
	        this.name = name;
	        this.price = price;
	        this.stock = 0;
	    }

	    // 재고 추가
	    public void addStock(int qty) {
	        stock += qty;
	    }

	    // 판매
	    public boolean sell() {

	        if(stock <= 0) {
	            return false;
	        }

	        stock--;
	        return true;
	    }

	    // getter
	    public String getName() {
	        return name;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public int getStock() {
	        return stock;
	    }
	}



