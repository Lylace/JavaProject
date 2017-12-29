package lylace.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SungJukJDBC3 {

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
		String insertSQL = "insert into sungjuk(sjno, name, kor, eng, mat, tot, avrg, grd) values ( sjno.nextval, ? ,?,?,?,?,?,?)";
		String updateSQL = null;
		String deleteSQL = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 학생 성적을 입력하세요(이름/국어/영어/수학)");
		String name = sc.nextLine();
		int kor = Integer.parseInt(sc.nextLine());
		int eng = Integer.parseInt(sc.nextLine());
		int mat = Integer.parseInt(sc.nextLine());

		// 총점/평균/학점 처리
		int tot = kor + eng + mat;
		double avrg = tot / 3;
		String grd = "가";

		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, name); // ? 자리에 실제로 적용될 값 지정
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avrg);
			pstmt.setString(7, grd);

			// 4.
			int cnt = pstmt.executeUpdate();

			System.out.println(cnt + "건의 데이터가 추가 되었습니다");

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
