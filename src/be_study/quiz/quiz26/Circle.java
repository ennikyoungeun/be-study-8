package be_study.quiz.quiz26;

public class Circle {
	
	int radius ;// 반지름 저장용 필드변수
	
	//Circle(){}
	
	void setRadius (int radius) {
		this.radius = radius;
	}
	double getArea() {
		//원넓이 :반지름 *반지름*3.14
		return (double) radius*radius*3.14;
	}
}
