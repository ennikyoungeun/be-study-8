package be_study.quiz.quiz28;

public class TopScoreStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최고득점자 찾기
		// 배열 생성
		String[] names = {"Elena","Suzie","John","Emily","Nada",
				"kate","Alex","Daniel","Hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};

		// 1등 인덱스 검색
		int i = topIndex(scores); //최고점이 있는 인덱스
		
		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
		}

		// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
		public static int topIndex(int[] arr) {//점수들의 배열->최대값이 위치한 인덱스 찾기
		/* 해당 함수를 완성하세요. */
			int maxIndex=0;//최고값을 저장할 변수
			for (int i=1; i<arr.length; i++) { //인덱스만큼 반복하며 
			if(arr[i]>arr[maxIndex]) { // 최고값을 갱신하면
				maxIndex=i; //maxIndex에 저장
			}
			}
		return maxIndex;
	}

}
