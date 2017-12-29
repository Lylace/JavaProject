package lylace.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import project.v1.SungJukVO;

public class SungJukJDBC2 {

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.136.128:1521:xe";
		String USR = "lylace";
		String PWD = "lylace";

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

		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생번호를 입력하세요");
		int no = sc.nextInt();

		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectOneSQL);
			pstmt.setInt(1, no); // 첫번째 ? 자리에 실제로 적용될 값 지정
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.
			SungJukVO sj = new SungJukVO();
			if (rs.next()) { // (조건에 일치하는 데이터가) 결과 집합에 존재 한다면
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setTot(rs.getInt("tot"));
				sj.setAvrg(rs.getDouble("avrg"));
				sj.setGrd(rs.getString("grd"));

			}

			System.out.println(sj);
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
