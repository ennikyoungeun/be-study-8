package be_study.quiz.quiz47;

import java.util.List;

public class DBStudentMain {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();

		// 1. 전체조회
		System.out.println("========== 1번 : 전체조회 ==========");
		List<StudentDTO> studentList = studentDAO.findStudentList();
		for (StudentDTO student : studentList) {
			System.out.println(student.toString());
		}

		// 2. 학년조회
		System.out.println("========== 2번 : 학년조회 ==========");
		
		System.out.println("------------- 1학년조회 ----------------");
		List<StudentDTO> gradeList = studentDAO.findStudentListByGrade(1);
		for (StudentDTO student : gradeList) {
			System.out.println(student.toString());
		}
		System.out.println("----------- 2학년조회 -----------------");
		List<StudentDTO> gradeList1 = studentDAO.findStudentListByGrade(2);
		for (StudentDTO student : gradeList1) {
			System.out.println(student.toString());
		}
		System.out.println("------------- 3학년조회 ----------------");
		List<StudentDTO> gradeList2 = studentDAO.findStudentListByGrade(3);
		for (StudentDTO student : gradeList2) {
			System.out.println(student.toString()); }
		
		System.out.println("------------- 4학년조회 ----------------");
		List<StudentDTO> gradeList3 = studentDAO.findStudentListByGrade(4);
		for (StudentDTO student : gradeList3) {
			System.out.println(student.toString()); }
		
		// 3. 학생 저장
		System.out.println("========== 3번 : 저장 ==========");

		StudentDTO student = new StudentDTO( 1004, "Ennikyoungeun", "Ennik",
				3, "0005314000000", "2000-05-31", "010)666-6666", 160,
				53, 101, 201, 1001 );
		int result = studentDAO.saveStudent(student);
		if (result > 0) {
			System.out.println("학생 저장 성공");
		} else {
			System.out.println("학생 저장 실패");
		}
	}
/*
 1. DB
AGE NUMBER -테이블 데이터-AGE-20-NULL
->NUMBER는 NULL을 저장할 수 있다.
2. 자바 기본형(int)
int age;
int는 기본형(Primitive Type)이므로 null을 저장할 수 없다.
int age = null;   // 컴파일 오류
3. 해결 방법 ① Wrapper 클래스(Integer) 사용 ⭐ (가장 많이 사용)
Integer age;
Integer는 객체(Object)이므로 null이 가능하다.
Integer age = null;   // 가능
JDBC에서도 보통 이렇게 많이 사용한다.

예시) -> Integer age = rs.getObject("AGE", Integer.class);

AGE가 NULL이면 age == null 이 된다.

4. 해결 방법 ② getInt() + wasNull()
int age = rs.getInt("AGE");
if (rs.wasNull()) {
    System.out.println("NULL입니다.");
}
getInt()는 DB 값이 NULL이어도 0 을 반환한다.
그래서 rs.wasNull() 로 방금 읽은 값이 실제 NULL인지 확인해야 한다.

비교
DB 값	getInt()	Integer(getObject())
10	10	10
NULL	0	null
--------------
DB NUMBER → NULL 가능
Java int → NULL 불가능
Java Integer → NULL 가능
ResultSet.getInt()는 NULL을 0으로 반환하므로 rs.wasNull()로 확인하거나, Integer와 getObject()를 사용하는 것이 안전하다.
 */
	}