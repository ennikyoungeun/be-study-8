package be_study.quiz;

public class Quiz22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열항목 최대값
		int[]scores= {88,92,75,63,95,70,85,90,100,67};
		int max= scores[0];
		int count=0;
		
		for(int i =1; i<scores.length; i++) {
			if(scores[i]>max) {
				max=scores[i];//  = max에 값입력,,!!!!!!!!!!!!
			}
		}System.out.println("최고점수 : "+max);
		
		int min= scores[0];
		
		for(int i =1; i<scores.length; i++) {
			if(scores[i]<min) {
				min=scores[i];
			}
		}System.out.println("최저점수 : "+min);
		
		
		//총합과 평균 구하기
		int sum=0;
		for(int score:scores) {
			sum +=score;
		}
		double avg= (double)sum/scores.length;
		System.out.println("총합 :" + sum);
		System.out.println("평균 : "+ avg);
		
		for(int i =0; i<scores.length; i++)
		 if (scores[i]>=80) {
			count++;
		}System.out.println("80점 이상 학생수 :" +count);
		
		
		
		
	}

}
