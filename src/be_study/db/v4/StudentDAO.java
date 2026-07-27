package be_study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	// 1. Student 전체 조회
	public List<StudentDTO> findStudentList() {

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " SELECT "
				+ " STUDNO, NAME, ID, GRADE, JUMIN, "
				+ " TO_CHAR(BIRTHDAY,'YYYY-MM-DD') BIRTHDAY, "
				+ " TEL, HEIGHT, WEIGHT, DEPTNO1, DEPTNO2, PROFNO "
				+ " FROM STUDENT ";
//		String sqlQuery = "select * from student ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {

			pstmt = conn.prepareStatement(sqlQuery);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				StudentDTO student = new StudentDTO();

				student.setStudno(rs.getInt("STUDNO"));
				student.setName(rs.getString("NAME"));
				student.setId(rs.getString("ID"));
				student.setGrade(rs.getInt("GRADE"));
				student.setJumin(rs.getString("JUMIN"));
				student.setBirthday(rs.getString("BIRTHDAY"));
				student.setTel(rs.getString("TEL"));
				student.setHeight(rs.getInt("HEIGHT"));
				student.setWeight(rs.getInt("WEIGHT"));
				student.setDeptno1(rs.getInt("DEPTNO1"));
				student.setDeptno2(rs.getInt("DEPTNO2"));
				student.setProfno(rs.getInt("PROFNO"));

				studentList.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}

		return studentList;
	}
	
	// 2. 학년별 Student 조회
	public List<StudentDTO> findStudentListByGrade(int grade) {

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " SELECT "
				+ " STUDNO, NAME, ID, GRADE, JUMIN, "
				+ " TO_CHAR(BIRTHDAY,'YYYY-MM-DD') BIRTHDAY, "
				+ " TEL, HEIGHT, WEIGHT, DEPTNO1, DEPTNO2, PROFNO "
				+ " FROM STUDENT "
				+ " WHERE GRADE = ? ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {

			pstmt = conn.prepareStatement(sqlQuery);

			pstmt.setInt(1, grade);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				StudentDTO student = new StudentDTO();

				student.setStudno(rs.getInt("STUDNO"));
				student.setName(rs.getString("NAME"));
				student.setId(rs.getString("ID"));
				student.setGrade(rs.getInt("GRADE"));
				student.setJumin(rs.getString("JUMIN"));
				student.setBirthday(rs.getString("BIRTHDAY"));
				student.setTel(rs.getString("TEL"));
				student.setHeight(rs.getInt("HEIGHT"));
				student.setWeight(rs.getInt("WEIGHT"));
				student.setDeptno1(rs.getInt("DEPTNO1"));
				student.setDeptno2(rs.getInt("DEPTNO2"));
				student.setProfno(rs.getInt("PROFNO"));

				studentList.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}

		return studentList;

	}
	
	// 3. Student 저장
	public int saveStudent(StudentDTO student) {

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " INSERT INTO STUDENT "
				+ "VALUES(?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ?)";

		int result = 0;

		try {

			pstmt = conn.prepareStatement(sqlQuery);

			pstmt.setInt(1, student.getStudno());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getId());
			pstmt.setInt(4, student.getGrade());
			pstmt.setString(5, student.getJumin());
			pstmt.setString(6, student.getBirthday());
			pstmt.setString(7, student.getTel());
			pstmt.setInt(8, student.getHeight());
			pstmt.setInt(9, student.getWeight());
			pstmt.setInt(10, student.getDeptno1());
			pstmt.setInt(11, student.getDeptno2());
			pstmt.setInt(12, student.getProfno());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}

		return result;
	}
	public StudentMypageDTO findStudentMypageByStudno(int Studno) {

			conn = DBConnectionManager.connectDB();

			String sqlQuery = " SELECT *"
					+ " from student s, department d "
					+ " WHERE STUDNO = ? "
					+ " AND s.deptno1 = d.deptno ";

			StudentMypageDTO smDTO = null;

			try {

				pstmt = conn.prepareStatement(sqlQuery);

				pstmt.setInt(1, Studno);

				rs = pstmt.executeQuery();

				while (rs.next()) {

					smDTO = new StudentMypageDTO();

					smDTO.setStudno(rs.getInt("STUDNO"));
					smDTO.setName(rs.getString("NAME"));
					smDTO.setId(rs.getString("ID"));
					smDTO.setGrade(rs.getInt("GRADE"));
					smDTO.setJumin(rs.getString("JUMIN"));
					smDTO.setBirthday(rs.getString("BIRTHDAY"));
					smDTO.setTel(rs.getString("TEL"));
					smDTO.setHeight(rs.getInt("HEIGHT"));
					smDTO.setWeight(rs.getInt("WEIGHT"));
					smDTO.setDeptno1(rs.getInt("DEPTNO1"));
					smDTO.setDeptno2(rs.getInt("DEPTNO2"));
					smDTO.setProfno(rs.getInt("PROFNO"));
					
					
					smDTO.setDeptno(rs.getInt("deptno"));
					smDTO.setDname(rs.getString("dname"));
					smDTO.setPart(rs.getInt("part"));
					smDTO.setBuild(rs.getString("build"));
						
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnectionManager.disconnectDB(conn, pstmt, rs);
			}
			return smDTO;

		}
		
	public StudentDTO findStudentByStudno(int Studno) {

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " SELECT "
				+ " STUDNO, NAME, ID, GRADE, JUMIN, "
				+ " TO_CHAR(BIRTHDAY,'YYYY-MM-DD') BIRTHDAY, "
				+ " TEL, HEIGHT, WEIGHT, DEPTNO1, DEPTNO2, PROFNO "
				+ " FROM STUDENT "
				+ " WHERE STUDNO = ? ";

		StudentDTO studentDTO = null;

		try {

			pstmt = conn.prepareStatement(sqlQuery);

			pstmt.setInt(1, Studno);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				studentDTO = new StudentDTO();

				studentDTO.setStudno(rs.getInt("STUDNO"));
				studentDTO.setName(rs.getString("NAME"));
				studentDTO.setId(rs.getString("ID"));
				studentDTO.setGrade(rs.getInt("GRADE"));
				studentDTO.setJumin(rs.getString("JUMIN"));
				studentDTO.setBirthday(rs.getString("BIRTHDAY"));
				studentDTO.setTel(rs.getString("TEL"));
				studentDTO.setHeight(rs.getInt("HEIGHT"));
				studentDTO.setWeight(rs.getInt("WEIGHT"));
				studentDTO.setDeptno1(rs.getInt("DEPTNO1"));
				studentDTO.setDeptno2(rs.getInt("DEPTNO2"));
				studentDTO.setProfno(rs.getInt("PROFNO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return studentDTO;

	}

	}

