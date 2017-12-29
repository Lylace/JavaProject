package lylace.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ZipcodeJDBC {

	public static void main(String[] args) {
		// 리소스 번들 경로
		String rbpath = "lylace.adv.oracle";

		// 오라클 접속정보 선언
		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// sql 관련 변수 선언
		String selectSQL = "select 우편번호, 시도, 시군구, 읍면, 도로명, 건물번호본번, 건물번호부번, 시군구용건물명, 법정동명, 리명, 지번본번  from zipcode_seoul";
		String selectSValSQL = "select * from zipcode_seoul where 도로명 like ?";

		try {
			ResourceBundle rb = ResourceBundle.getBundle(rbpath);
			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");

			Class.forName(DRV);

			conn = DriverManager.getConnection(URL, USR, PWD);

			pstmt = conn.prepareStatement(selectSQL);

			rs = pstmt.executeQuery();

			List<ZipcodeVO> zclist = new ArrayList<>();
			while (rs.next()) {
				ZipcodeVO zc = new ZipcodeVO();
				zc.set우편번호(rs.getString("우편번호"));
				zc.set시도(rs.getString("시도"));
				zc.set시군구(rs.getString("시군구"));
				zc.set읍면(rs.getString("읍면"));
				zc.set도로명(rs.getString("도로명"));
				zc.set건물번호본번(rs.getString("건물번호본번"));
				zc.set건물번호부번(rs.getString("건물번호부번"));
				zc.set시군구용건물명(rs.getString("시군구용건물명"));
				zc.set법정동명(rs.getString("법정동명"));
				zc.set리명(rs.getString("리명"));
				zc.set지번본번(rs.getString("지번본번"));
				zclist.add(zc);
			}

			for (ZipcodeVO zc : zclist) {
				System.out.println(zc);
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
