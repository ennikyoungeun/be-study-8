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
			System.out.println(student.toString());
		}
		System.out.println("------------- 4학년조회 ----------------");
		List<StudentDTO> gradeList3 = studentDAO.findStudentListByGrade(4);

		for (StudentDTO student : gradeList3) {
			System.out.println(student.toString());
		}

		// 3. 학생 저장
		System.out.println("========== 3번 : 저장 ==========");

		StudentDTO student = new StudentDTO(
				1004,
				"Ennikyoungeun",
				"Ennik",
				3,
				"0005314000000",
				"2000-05-31",
				"010)666-6666",
				160,
				53,
				101,
				201,
				1001		
				);

		int result = studentDAO.saveStudent(student);

		if (result > 0) {
			System.out.println("학생 저장 성공");
		} else {
			System.out.println("학생 저장 실패");
		}

	}

}