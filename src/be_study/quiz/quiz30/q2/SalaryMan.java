package be_study.quiz.quiz30.q2;

public class SalaryMan {
	//필드 :월급여 저장
	//int salary =1000000;
	int salary; //월급여액
	//생성자에서 인자가 월 급여액으로 지정
	public SalaryMan() {
		this.salary = 1000000;}
		
	public SalaryMan(int salary ) {
		this.salary=salary;
	}
	//메소드 :연봉반환 (월급*12+보너스,월급*500%)
	public int getAnnualGross() {
		return (this.salary*12)+(this.salary*5);
		
	}
}

