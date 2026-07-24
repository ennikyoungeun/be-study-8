package be_study.quiz.quiz47;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v3.DBConnectionManager;
import be_study.db.v3.ProfessorDTO;


public class StudentDAO {

	public List<StudentDTO> findStudentList() {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " select " 
				+ " studno, name, id,grade,jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday,"
				+ "tel,height,weight,deptno1,deptno2,profno "
				+ " from student ";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {  
				StudentDTO  student = new StudentDTO();
				
				student.setStudno( rs.getInt("studno") );
				student.setName( rs.getString("name") );
				student.setId( rs.getString("id") );
				student.setGrade( rs.getInt("grade") );
				student.setJumin( rs.getString("jumin") );
				student.setBirthday( rs.getString("birthday") );
				student.setTel( rs.getString("tel") );
				student.setHeight( rs.getInt("height") );
				student.setWeight( rs.getInt("weight") );
				student.setDeptno1( rs.getInt("deptno1") );
				student.setDeptno2( rs.getInt("deptno2") );
				student.setProfno( rs.getInt("profno") );
				
				studentList.add(student);
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
		
	}

	
}
