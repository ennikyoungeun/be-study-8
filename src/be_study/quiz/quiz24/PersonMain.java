package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person =new Person();
		
		person.name="이은호";
		person.gender= "남성";
		person.age=19;
		person.high= 175;
		person.weight= 70;
		person.job="학생";
		person.blood= "B형";
		person.health="좋음";
		person.isSleep= false;
		
		System.out.println(person.name);
		System.out.println(person.gender);
		System.out.println(person.age);
		System.out.println(person.high);
		System.out.println(person.weight);
		System.out.println(person.job);
		System.out.println(person.blood);
		System.out.println(person.health);
		System.out.println(person.isSleep);
		
		
		
				
	}

}
