package lylace.lab;

public class Lab12 {

	public static void main(String[] args) {

		CustomerV1 c = new CustomerV1();
		c.cno = 1;
		c.name = "박지성";
		c.jumin = "810101-111111";
		c.addr = "영국 런던";
		c.mphone = "000-5000-0001";

		c = new CustomerV1(2, "김연아", "900101-211111", "한국 서울", "000-6000-0001");

		BookV1 b = new BookV1();
		b.bno = 1;
		b.bname = "축구의 역사";
		b.pub = "굿스포츠";
		b.bP = 7000;

		b = new BookV1(2, "축구아는 여자", "나무수", 13000);

		Order o = new Order();
		o.cno = 1;
		o.bno = 1;
		o.sP = 7000;
		o.oDate = "2014-07-01";

		o = new Order(1, 2, 13000, "2014-07-03");

		Student stu = new Student();
		stu.sno = 201350050;
		stu.name = "김태희";
		stu.addr = "경기도 고양시";
		stu.age = 25;
		stu.birth = "1985.3.22";
		stu.major = "컴퓨터공학";
		stu.pno = 504;
		stu.talkT = "목 2교시";

		stu = new Student(201250006, "송혜교", "서울 영등포구", 22, "1988.9.17", "컴퓨터공학", 301, "월 3교시");

		Major m = new Major();
		m.major = "컴퓨터공학";
		m.phNo = "123-4567-8901";
		m.office = "E동 2층";
		m.deanNo = 504;
		m.appoD = 2007;

		m = new Major("의상디자인", "234-5678-9012", "A동 1층", 301, 2009);

		Subject sub = new Subject();
		sub.subNo = "0205";
		sub.subNa = "프로그래밍";
		sub.subSumm = "자바 프로그래밍";
		sub.pno = 301;

		sub = new Subject("0211", "드레스 코드", "옷 입기의 기초", 445);

		Professor p = new Professor();
		p.pno = 301;
		p.pNa = "이순신";
		p.pMajor = "프로그래밍";

		p = new Professor(445, "정약용", "의상디자인");

	}

}

class CustomerV1 {
	int cno;
	String name;
	String jumin;
	String addr;
	String mphone;

	CustomerV1() {
	}

	CustomerV1(int cno, String name, String jumin, String addr, String mphone) {
		this.cno = cno;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mphone = mphone;
	}

}

class BookV1 {
	int bno;
	String bname;
	String pub;
	int bP;

	BookV1() {
	}

	BookV1(int bno, String bname, String pub, int bP) {
		this.bno = bno;
		this.bname = bname;
		this.pub = pub;
		this.bP = bP;
	}

}

class Order {
	int cno;
	int bno;
	int sP;
	String oDate;

	Order() {
	}

	Order(int cno, int bno, int sP, String oDate) {
		this.cno = cno;
		this.bno = bno;
		this.sP = sP;
		this.oDate = oDate;
	}

}

class Student {
	long sno;
	String name;
	String addr;
	int age;
	String birth;
	String major;
	int pno;
	String talkT;

	Student() {
	}

	Student(long sno, String name, String addr, int age, String birth, String major, int pno, String talkT) {
		this.sno = sno;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.birth = birth;
		this.major = major;
		this.pno = pno;
		this.talkT = talkT;
	}

}

class Major {
	String major;
	String phNo;
	String office;
	int deanNo;
	int appoD;

	Major() {
	}

	Major(String major, String phNo, String office, int deanNo, int appoD) {
		this.major = major;
		this.phNo = phNo;
		this.office = office;
		this.deanNo = deanNo;
		this.appoD = appoD;
	}

}

class Subject {
	String subNo;
	String subNa;
	String subSumm;
	int pno;

	Subject() {
	}

	Subject(String subNo, String subNa, String subSumm, int pno) {
		this.subNo = subNo;
		this.subNa = subNa;
		this.subSumm = subSumm;
		this.pno = pno;
	}

}

class Professor {
	int pno;
	String pNa;
	String pMajor;

	Professor() {
	}

	Professor(int pno, String pNa, String pMajor) {
		this.pno = pno;
		this.pNa = pNa;
		this.pMajor = pMajor;
	}

}