package be_study.homework.home.homeLv3;

import java.util.Arrays;

public class Lv3Main {

	public static void main(String[] args) {
		  // 21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드
        Person[] arr = personArray(5);
        
        // 25. Person을 생성해서 배열 인덱스 0에 넣는 방법
        arr[0] = new Person("지창욱", 40);
        arr[1] = new Person("서강준", 35);
        arr[2] = null; // null 요소 포함
        arr[3] = new Person("박보검", 32);
        arr[4] = new Person("김민규", 38);
        
    }
    
    // 21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드를 작성하라.
    public static Person[] personArray(int length) {
        return new Person[length];
    }
    
    // 22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.
    public static int sumAge(Person[] arr) {
        int total = 0;
        for (Person p : arr) {
            if (p != null) total += p.age;
        }
        return total;
    }
    
    // 23. Person 배열을 전달하면, 모든 나이를 10으로 초기화하는 메서드를 만들어라.
    public static void resetAge(Person[] arr) {
        for (Person p : arr) {
            if (p != null) p.age = 10;
        }
    }
    
    // 24. Person 배열의 name만 따로 String[] 에 담아 리턴하는 메서드를 작성하라.
    public static String[] getNames(Person[] arr) {
        String[] names = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) names[i] = arr[i].name;
        }
        return names;
    }
    
    // 26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.
    public static void printArray(Person[] arr) {
        for (Person p : arr) {
            if (p != null) {
                System.out.println("이름: " + p.name + ", 나이: " + p.age);
            } else {
                System.out.println("null 요소입니다.");
            }
        }
    }
    
    // 27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.
    public static Person findByName(Person[] arr, String targetName) {
        for (Person p : arr) {
            if (p != null && p.name.equals(targetName)) return p;
        }
        return null;
    }
    
    // 28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.
    public static Person[] createEvenArray(int length) {
        Person[] arr = new Person[length];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] = new Person("짝수" + i, 20);
            else arr[i] = null;
        }
        return arr;
    }
    
    // 29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.
    public static Person copyNameOnly(Person original) {
        Person newPerson = new Person();
        newPerson.name = original.name;
        return newPerson;
    }
    
    // 30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라.
    public static Person[] filterOver30(Person[] arr) {
        int count = 0;
        for (Person p : arr) {
            if (p != null && p.age >= 30) count++;
        }
        
        Person[] result = new Person[count];
        int index = 0;
        for (Person p : arr) {
            if (p != null && p.age >= 30) result[index++] = p;
        }
        return result;
    }
}


