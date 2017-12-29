package lylace.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v1.SungJukVO;

public class SungJukJDBC6 {

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// ResourceBundle을 이용해서 JDBC 관련정보를
		// 특정파일에서 키=값 형태로 읽어서 처리
		String rbpath = "lylace.adv.oracle";
		// 리소스번들 파일경로 지정 : 패키지.파일명
		// (.properties는 제외!!)

		// Oracle 접속정보 제공
		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// sql 관련 변수 선언
		String selectSQL = "select sjno, name, kor, eng, mat, regdate from sungjuk order by sjno desc";
		String selectOneSQL = "select * from sungjuk where sjno = ?";
		String insertSQL = "insert into sungjuk";
		String updateSQL = null;
		String deleteSQL = null;

		try {
			// 0. 접속정보를 리소스번들로부터 읽어오기
			ResourceBundle rb = ResourceBundle.getBundle(rbpath);
			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");

			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery(); // select

			List<SungJukVO> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO sj = new SungJukVO();
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setKor(rs.getInt("eng"));
				sj.setKor(rs.getInt("mat"));
				sjlist.add(sj);
			}

			for (SungJukVO sj : sjlist) {
				System.out.println(sj);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception ex) {
			}
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
			try {
				conn.close();
			} catch (Exception ex) {
			}
		}

	}

}
