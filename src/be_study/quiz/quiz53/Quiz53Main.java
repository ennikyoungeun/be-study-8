package be_study.quiz.quiz53;

public class Quiz53Main {
	/*
	  https://www.data.go.kr/data/15073861/openapi.do
	  위 한국환경공단_에어코리아_대기오염정보 API 를 활용신청하고 API 활용하여 구현해보기
	 
	  대기질 예보통보 조회 요청주소
	  http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth
	 
	  초미세먼지 주간예보 조회 요청주소
	  http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth
	  
	  위 API 요청을 통해서 데이터를 획득하고, 적절한 형태로 DB에 저장하는 과정을 수행해보기. - DB 생성 시에는 저장할 컬럼을 선별할것
	  - API 요청에 대한 응답인 JSON 텍스트를 DTO로 파싱할것 - DAO 를 사용하여 저장까지 수행할 것
	  
	 */

public static void main(String[] args) throws Exception {

		
		// 필요한 데이터 선정 -> DB 테이블 설계 -> 테이블 생성
		// API 요청 -> 응답 JSON 파싱 -> DTO 옮기기 -> DAO 통해 DB 저장
		ArpltnInforInqireSvcRepository repository = new ArpltnInforInqireSvcRepository();
		//repository.requestApi_getMinuDustWeekFrcstDspth("2026-07-28");
		
		
		// JSON 파싱 -> DTO 담긴상태
		MinuDustWeek minuDustWeek = repository.getMinuDustWeekFrcstDspth("2026-07-28");
		System.out.println(minuDustWeek);
		
		// DTO -> DAO 전달 저장해달라~ -> DB 저장
		ArpltnInforInqireSvcDAO dao = new ArpltnInforInqireSvcDAO();
		
		int result = dao.saveMinuDustWeek(minuDustWeek);
		if( result > 0 ) {
			System.out.println("잘 저장됨");
		}
		
	}

}

