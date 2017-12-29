package lylace.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SoccerJDBC {

	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.136.128:1521:xe";
	private static String USR = "lylace";
	private static String PWD = "lylace";

	public static void main(String[] args) {
		// 축구선수 테이블 CRUD
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append("축구선수 정보 입력입니다.").append("\n").append("선수명/팀명/팀연고지/포지션/등번호/생년월일/키/몸무게").append("순으로 입력해 주십시오.");
		System.out.println(sb.toString());

		String scname = sc.nextLine();
		String tmname = sc.nextLine();
		String tmregion = sc.nextLine();
		String tmpos = sc.nextLine();
		int bkno = Integer.parseInt(sc.nextLine());
		String birth = sc.nextLine();
		int height = Integer.parseInt(sc.nextLine());
		int weight = Integer.parseInt(sc.nextLine());

		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			String sql = "insert into soccer values ( scno.nextval , ? , ? , ? , ? , ? , ? , ? , ? ,default) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, scname);
			pstmt.setString(2, tmname);
			pstmt.setString(3, tmregion);
			pstmt.setString(4, tmpos);
			pstmt.setInt(5, bkno);
			pstmt.setString(6, birth);
			pstmt.setInt(7, height);
			pstmt.setInt(8, weight);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터가 추가됨!");

			sql = "select * from Soccer";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			StringBuffer sb1 = new StringBuffer();
			while (rs.next()) {
				sb1.append(rs.getString(1)).append(" ").append(rs.getString(2)).append(" ").append(rs.getString(3))
						.append(" ").append(rs.getString(4)).append(" ").append(rs.getString(5)).append(" ")
						.append(rs.getString(6)).append(" ").append(rs.getString(7)).append(" ").append(rs.getString(8))
						.append(" ").append(rs.getString(9)).append(" ").append(rs.getString(10)).append("\n");
			}
			System.out.println(sb1.toString());
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
