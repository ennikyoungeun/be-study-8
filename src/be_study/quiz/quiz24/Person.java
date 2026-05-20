package be_study.quiz.quiz24;

public class Person {
	
	String name ; //이름
	String gender; //성별
	int age;//나이
	int high; //키
	double weight;
	String job;//직업
	String blood;//혈액형
	String health;//건강상태
					//좋음 나쁨....
	boolean isSleep;//수면중 여부
					// true-수면중
				    // false-수면중아님
	
	//생성자
	Person(){} // 기본생성자
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
