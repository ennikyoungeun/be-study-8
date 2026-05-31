package be_study.homework.home;

public class Person {

	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void hello() {
	System.out.println(name + " : Hello!");
	}
	
	public static Person createPerson(String name, int age) {
	    // 1. Person 객체 생성
	    Person p = new Person();
	    
	    // 2. 매개변수로 받은 name과 age 세팅
	    p.setName(name);
	    p.setAge(age);
	    // 3. 세팅된 Person 객체 리턴
	    return p;
	}
}

