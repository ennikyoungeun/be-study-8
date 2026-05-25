package be_study.cls.cls08;

public class SingletonMain {

	public static void main(String[] args) {
		
		//외부에서 생성-> 여러개의 객체가 존제-> 외부에서 생성못하게 제한
		/*
		  singleton s1 =new singleton(); //객체생성
		  singleton s2 =new singleton(); //객체생성
		  singleton s3 =new singleton(); //객체생성
		 */
		//singleton s3 =new singleton(); //생성을 못하는데 1개를 어떻게?->내부에서 생성
		//s3.singleton;//생성한 인스턴스 객체를 통해서 변수에 접근해야 하는데...\
		//singleton s1 =singleton.singleton;//null
		//singleton.singleton =new singleton();//외부에서 생성 불가능
		
		//singleton.singleton=null;// 기존1개 생성된 객체=null(삭제/파괴)
		
		//singleton s3 =new Singleton();
		//s3.getInstace();
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);//같은객체
		System.out.println(s3==s2);
		
		
	}

}
