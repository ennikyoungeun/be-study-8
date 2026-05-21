package be_study.quiz.quiz26;

public class Tv {

	String brand;
	int year;
	int inch;
	
	Tv(String brand, int year, int inch){
		this.brand= brand;
		this.year = year;
		this.inch= inch;
	}
	void show() {
		System.out.println(this.brand+"제품"+this.year+"년형"+this.inch+"인치 TV");
	}
	
}
