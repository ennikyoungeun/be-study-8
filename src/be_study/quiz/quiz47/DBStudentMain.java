package be_study.quiz.quiz47;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v1.Dept;


public class DBStudentMain {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();

		List<StudentDTO> studentList = studentDAO.findStudentList();
		

		for(StudentDTO s : studentList) {
			
			
			System.out.println(s.toString());
			System.out.println(s.getBirthday());
			
			//ConvertDateUtil.convertDateStringToLocalDateTime(p.getHiredate());
		}
	



	}
}
