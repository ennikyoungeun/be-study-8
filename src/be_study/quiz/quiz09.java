package be_study.quiz;

public class quiz09 {

	public static void main(String[] args) {
		int i=0;
		for(i=0; i<=10; i++) {
			System.out.print(i+"");
		}
		System.out.println();
		
		for(i=1; i<10; i++) {
			System.out.print(i+"");
		}
		System.out.println();
		
		for(i= 10; i <=100; i=i+10) {
			
			System.out.print(i+"");
		}System.out.println();
		
		for(i= 25; i <=100; i=i+25) {	
			System.out.print(i+"");
		}System.out.println();
		System.out.println("----------------------------------------------");

		i=1;
		while(i<=55) {
			i++;
			if (i<50)
				continue;
			System.out.print(i+"");
			if (i==56)
				break;
			}
		System.out.println();
		i=11;
		while (i<=11) {
			i--;
			System.out.print(i+"");
			if (i==0)
				break;
			}
		System.out.println();
		
		i=30;
		while(i>= 0) {
			System.out.print(i+"");
			i-=5;
		}System.out.println();
		
		i=30;
		while(i> 0) {
			System.out.print(i+"");
			i-=5;
		}System.out.println();
		
		i=25;
		while(i>= 0) {
			System.out.print(i+"");
			i-=5;
		}System.out.println();
		
	}
 }