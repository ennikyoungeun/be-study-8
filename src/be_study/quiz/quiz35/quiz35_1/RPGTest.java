package be_study.quiz.quiz35.quiz35_1;

public class RPGTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 및 초기화
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;

		Wizard wizard = new Wizard();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;

		// 두 객체의 펀치
		novice.punch();
		wizard.punch();

		// 위자드 객체의 파이어볼
		wizard.fireball();
		


		/* 1. Wizard 클래스를 Novice 클래스로부터 확장하세요. */
	
		/* 2. mp 필드를 추가하세요. */

		/* 3. fireball() 메소드를 만드세요. */
		

	}

}
