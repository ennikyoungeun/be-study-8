package be_study.quiz.quiz38;

public class UnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank t1 =new Tank();
		Marin m1 =new Marin();
		Dropship d1 =new Dropship();
		
		Unit[]arr = {t1,m1,d1};
		
		for (Unit u :arr) {
			u.move(10, 20);
			u.stop();
		}
		t1.changeMode();
		m1.stimPack();
		d1.load();
		d1.unload();
		
		
	}

}
