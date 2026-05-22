package be_study.cls.cls05;

import java.util.Scanner;

public class GalaxyMain {

	public static void main(String[] args) {
		//static 은 클래스 명. 변수명 접근 바로 가능
		System.out.println("정적멤버 :" +Galaxy.madeBy);
		//System.out.println(Galaxy.owner); 인스턴스 변수
		Galaxy.showMadeBy();
		
		Galaxy g1 =new Galaxy();//인스턴스 객체 생성
		g1.owner ="이회장";
		g1.model="갤럭시 26울트라";
		
		g1.showInfo();
		System.out.println(g1.madeBy);
		System.out.println(Galaxy.madeBy);
		g1.showMadeBy();     //△ 문법적 오류는 아니나
		Galaxy.showMadeBy(); //O 권장사항
		
		Galaxy g2 =new Galaxy();
		g2.owner ="김부장";
		g2.model="갤럭시Z플립10";
		
		g2.showInfo();
		System.out.println(g2.madeBy);
		System.out.println(Galaxy.madeBy);
		g2.showMadeBy();
		
		System.out.println(Math.random()); //Math m = new Math();
		
		//String.valueOf()
		//Integer.parseInt();
		
		Scanner scanner = new Scanner(System.in);
		//scanner.nextInt();
		
		System.out.println(3*3*3.14);
		System.out.println(3*3*Math.PI);
		
		
		
	}

}
