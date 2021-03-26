package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberList {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		//jdbc:oracle:thin:@호스트(ip번호):포트번호:서비스이름
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="java";//오라클 접속 아이디
		String pwd="java1234";//비번
		Connection conn=null;//DB접속 객체
		PreparedStatement pstmt = null;//DB의 SQL문장 처리
		ResultSet rs = null;//테이블내의 레코드값을 반환처리
		
		try {
			Class.forName(driver);//jdbc driver 로딩(생략가능)
			conn=DriverManager.getConnection(url, id, pwd);
			System.out.println("오라클 서버에 접속되었습니다.");
			String sql="select * form member";
			pstmt = conn.prepareStatement(sql);//sql 실행 객체
			rs = pstmt.executeQuery();
			System.out.println("아이디\t이름\t비번");
			while(rs.next()) {//다음 레코드가 존재하면
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				System.out.println(userid+"\t"+passwd+"\t"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(rs !=null)	rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs !=null)	pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs !=null)	conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
