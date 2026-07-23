package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findProduct();
		
		//-----------------------------------
		Product p1 = findProductByP_code(100);
		System.out.println(p1.toString()); //단일행 리턴 호출.
		//-----------------------------------
		
		List<Product> ProductList1 = findProductList();
		
		if (ProductList1 == null) {
			System.out.println("조회 데이터가 없구나..");
		}else {//데이터 있음
			
			for(Product p : ProductList1) {
				System.out.println( p.toString() );
			}
		}

	}

	
	//	query  select * from product
	public static void findProduct() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//DB 연결 정보

		//String db_url = "jdbc:oracle:thin:@150.25.33.191:12364:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";


		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체


		// DB 연결


		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}


		//실행할 쿼리 준비
		String sqlQuery = " select * from product ";

		//쿼리 실행, 실행 후 후속 데이터 처리

		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {   // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회

				// column Index 기준 조회
				//System.out.print( rs.getInt(1) + " ");
				//System.out.print( rs.getString(2) + " ");	
				//System.out.println( rs.getString(3) );

				// column 이름(별칭) 기준 조회
				System.out.print( rs.getInt("p_code") + " ");
				System.out.print( rs.getString("p_name") + " ");	
				System.out.println( rs.getInt("p_price") );
			}


		} catch (SQLException e) { 
			e.printStackTrace();
		}


		//DB 연결 정료
		try {

			if(rs != null)
				rs.close();		//null 객체 메소드 호출 -> NullPointerException

			if(psmt != null)
				psmt.close();

			if(conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static List<Product> findProductList() {

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

		Product product = null;

//실행할 쿼리 준비
		String sqlQuery = " select * from product ";
		//String sqlQuery = " select * from dept where 1=2 ";  -> 데이터 없는 경우 테스트
		
		List<Product> ProductList = null;

//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) { //다음에 읽어올 데이터가 잇는가? true 다음 데이터가
				//rs가 하나의 행을 가리키고 열단위 값을 기준으로 조회
				
				//데이터가 잇다.
				
				//한줄 조회 한행 데이터
				//한행데이터 -> dept 객체 
				//List<Dept>  .add(Dept)
				
				//colunm 이름(별칭) 기준 조회
				product = new Product();

				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));
				
				if(ProductList == null) {
					ProductList = new ArrayList<>();
				}
				ProductList.add(product);
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

		return ProductList;
	}



//-------------------------------------------------
public static Product findProductByP_code(int p_code) {
	
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
	Connection conn = null; //db 연결
	PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
	ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
	
	// DB 연결
	try {
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	Product product = null;
	
	//실행할 쿼리 준비
	String sqlQuery = " select * from product where p_code = ? ";
	
	//쿼리 실행, 실행 후 후속 데이터 처리
	try {
		psmt = conn.prepareStatement(sqlQuery);
		
		//파라미터 세팅 (쿼리에 있는 ? 위치에 값 채우기)
		psmt.setInt(1, p_code);
		
		rs = psmt.executeQuery(); //쿼리 실행
		
		//조회한 데이터가 1개인 경우
		if(rs.next()) {   // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
			
			//데이터가 있다 
			
			product = new Product();

			product.setP_code(rs.getInt("p_code"));
			product.setP_name(rs.getString("p_name"));
			product.setP_price(rs.getInt("p_price"));
			
		}
	} catch (SQLException e) { 
		e.printStackTrace();
	}
	
	//DB 연결 정료
	try {
		if(rs != null)
			rs.close();		//null 객체 메소드 호출 -> NullPointerException
		if(psmt != null)
			psmt.close();
		if(conn != null)
			conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return product;

}
//-----------------------------------
}
