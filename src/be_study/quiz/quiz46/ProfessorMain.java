package be_study.quiz.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorMain {

	public static void main(String[] args) {
		List<Professor> professorList1 = findProfessorList(103);
		
		if (professorList1 == null) {
			System.out.println("조회 데이터가 없구나..");
		}else {//데이터 있음
			
			for(Professor  professor : professorList1) {
				System.out.println(  professor.toString() );
			}
		}
		

	}
	public static List<Professor> findProfessorList(int deptno) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

//db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Professor professor = null;

//실행할 쿼리 준비
		String sqlQuery = " select * from professor where deptno =? "; //where=deptno XX
		//String sqlQuery = " select * from dept where 1=2 ";  -> 데이터 없는 경우 테스트
		
		List<Professor> professorList = null;

//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1,deptno);
			rs = psmt.executeQuery();
			
			while(rs.next()) { //다음에 읽어올 데이터가 잇는가? true 다음 데이터가
				//rs가 하나의 행을 가리키고 열단위 값을 기준으로 조회
				
				//데이터가 잇다.
				
				//한줄 조회 한행 데이터
				//한행데이터 -> dept 객체 
				//List<Dept>  .add(Dept)
				
				//colunm 이름(별칭) 기준 조회
				professor = new Professor();

				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
				professor.setDeptno(rs.getInt("deptno"));
				
				if(professorList == null) {
					professorList = new ArrayList<>();
				}
				professorList.add(professor);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

			
//DB 연결 정료
		try {
			if (rs != null)
				rs.close(); // null 객체 메소드 호출 -> NullPointerException
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return professorList;
	}
}