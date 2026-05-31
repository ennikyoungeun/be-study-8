package be_study.homework.home;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11. Person 객체 하나를 만들어 name과 age를 설정하고 출력하라.
        Person p1 = new Person();
        p1.name = "지창욱";
        p1.age = 40;
        System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
//		12. Person 객체를 생성해 hello() 메서드를 실행해보라.
        Person p2 = new Person();
        p2.name="박보검";
        p2.age=33;
        p2.hello();
//		13. Person 객체를 매개변수로 받아 name을 출력하는 메서드를 만들어라.
        System.out.println(p2.name);
//		14. Person 객체를 리턴하는 메서드를 작성하라(name과 age 세팅 후 리턴).
        Person newPerson = Person.createPerson("이순신", 30);
        System.out.println("새 객체 이름: " + newPerson.name + ", 나이: " + newPerson.age);  
//		15. Person 두 명을 만들어 age가 큰 사람을 출력하라.
        if(p1.age> p2.age) {
        	System.out.println("나이가 많은사람: "+p1.name);
        }else {
        	System.out.println("나이가 많은사람: "+p2.name);
        }
//		16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드를 작성하라. (원본 확인)
        System.out.println("기존나이: "+p2.age);
        System.out.println("1증가: "+((p2.age)+1));
//		17. Person을 만들고, 그 객체의 참조를 두 변수에 나눠 담은 뒤 값 변경 테스트를 해보라.
		Person p3 = new Person();
        p3.name = "이영희";
        Person p4 = p3; // 참조값 복사
        p4.name = "박민수";
        System.out.println(p3.name);
        
//      18. Person 배열을 만들어 3명을 채워 넣고 이름을 출력하라.
        String[] person = new  String[]{"영지,","지원,","석환"};
        for(int i=0; i<person.length; i++) {
        	System.out.print(person[i]);
        }
        System.out.println();
        
//		19. Person 배열을 매개변수로 받아 모든 사람의 hello()를 호출하라.
      
        
//		20. Person 배열을 만들어 가장 나이가 많은 사람을 리턴하는 메서드를 작성하라.

	
	

	
	}

}
