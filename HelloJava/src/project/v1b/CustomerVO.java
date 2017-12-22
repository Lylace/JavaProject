package project.v1b;

public class CustomerVO {
	private int cNo;
	private String cName;
	private String cReg;
	private String cAddr;
	private String cCph;

	public CustomerVO() {
	}

	public CustomerVO(int cNo, String cName, String cReg, String cAddr, String cCph) {
		this.cNo = cNo;
		this.cName = cName;
		this.cReg = cReg;
		this.cAddr = cAddr;
		this.cCph = cCph;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcReg() {
		return cReg;
	}

	public void setcReg(String cReg) {
		this.cReg = cReg;
	}

	public String getcAddr() {
		return cAddr;
	}

	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}

	public String getcCph() {
		return cCph;
	}

	public void setcCph(String cCph) {
		this.cCph = cCph;
	}

	@Override
	public String toString() {
		String fmt = "고객정보 [고객번호 : %d, 이름 : %s, 주민번호 : %s, 주소 : %s, 핸드폰 : %s]";
		return String.format(fmt, cNo, cName, cReg, cAddr, cCph);
	}

}
