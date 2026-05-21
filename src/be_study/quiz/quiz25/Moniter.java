package be_study.quiz.quiz25;

public class Moniter {
	//*속성
	int inch;         //인치수(int타입) int inch;
	String made;      //제조사(String타입)
	String model;     //모델명(String타입)

	//*생성자
	//매개변수로 3개를 모두 받아서 저장하는 생성자
	Moniter(String made,String model,int inch){
		this.made= made;
		this.model= model;
		this.inch= inch;
	}
	//*메소드
	//가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성
	void showInfo() {
		System.out.println(
	 "제조사:"+made+"모델명:"+model+"인치:"+inch+"인치");
	}
	
}
