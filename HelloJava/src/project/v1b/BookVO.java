package project.v1b;

public class BookVO {
	private int bNo;
	private String bTi;
	private String bPub;
	private int bPri;

	public BookVO() {
	}

	public BookVO(int bNo, String bTi, String bPub, int bPri) {
		this.bNo = bNo;
		this.bTi = bTi;
		this.bPub = bPub;
		this.bPri = bPri;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbTi() {
		return bTi;
	}

	public void setbTi(String bTi) {
		this.bTi = bTi;
	}

	public String getbPub() {
		return bPub;
	}

	public void setbPub(String bPub) {
		this.bPub = bPub;
	}

	public int getbPri() {
		return bPri;
	}

	public void setbPri(int bPri) {
		this.bPri = bPri;
	}

	@Override
	public String toString() {
		String fmt = "도서정보 [도서번호 : %d, 제목 : %s, 출판사 : %s, 가격 : %d]";
		return String.format(fmt, bNo, bTi, bPub, bPri);
	}

}
