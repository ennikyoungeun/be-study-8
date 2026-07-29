package be_study.api.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be_study.db.v4.DBConnectionManager;

public class MidFcstDAO {
	
	/*
	CREATE TABLE MID_TA
	(
	    --no
	    tm_fc VARCHAR2(12),         202607280600
	    reg_id VARCHAR2(8),         11B10101
	    ta_min4 NUMBER,
	    ta_max4 NUMBER,
	    ta_min5 NUMBER,
	    ta_max5 NUMBER,
	    CONSTRAINT MID_TA_PK PRIMARY KEY (tm_fc, reg_id)
	);
	
	CREATE TABLE MID_TA_REG_ID
	(
	    reg_id VARCHAR2(8),
	    reg_name VARCHAR2(32)
	);
	 */
	
	public int saveMidTa(MidTaDTO midTaDTO) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " INSERT INTO MID_TA"
				+ "VALUES(?, ?, ?, ?, ?,  ?)";

		int result = 0;

		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setString(1, midTaDTO.getTmFc());
			
			psmt.setString(2, midTaDTO.getRegId());
			psmt.setInt(3, midTaDTO.getTaMin4());
			psmt.setInt(4, midTaDTO.getTaMax4());
			psmt.setInt(5, midTaDTO.getTaMin5());
			psmt.setInt(6, midTaDTO.getTaMax5());
			

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
