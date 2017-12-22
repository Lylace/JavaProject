package lylace.lab;

public class Lab13 {

	public static void main(String[] args) {
		// 37, 38, 39

		Person 혜교 = new Person();
		System.out.println(혜교);

		// String name = "혜교";
		// String addr = "서울";
		// String phNo = "123-4567";
		// System.out.printf("%s %s %s\n", name, addr, phNo);

		Person 지현 = new Person("지현", "인천", "987-6543");
		System.out.println(지현);

	}

}

// # 37
// Person : 이름, 주소, 전화번호 -VO클래스
// Customer : Person 클래스, 고객번호 ,마일리지

class Person {
	// 멤버 변수
	private String name;
	private String addr;
	private String phNo;

	// 생성자
	public Person() {
		this("혜교", "서울", "123-4567");
	}

	public Person(String name, String addr, String phNo) {
		this.name = name;
		this.addr = addr;
		this.phNo = phNo;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phNo=" + phNo + "]";
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

}

class Customer {
	// 매개변수
	private String name;
	private String addr;
	private String phNo;
	private long cusNo;
	private int mileage;

	// 생성자
	public Customer() {
		this("혜교", "서울", "123-4567", 1, 1000);
	}

	public Customer(String name, String addr, String phNo, long cusNo, int mileage) {
		this.name = name;
		this.addr = addr;
		this.phNo = phNo;
		this.cusNo = cusNo;
		this.mileage = mileage;
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public long getCusNo() {
		return cusNo;
	}

	public void setCusNo(long cusNo) {
		this.cusNo = cusNo;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	// toString
	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + ", phNo=" + phNo + ", cusNo=" + cusNo + ", mileage="
				+ mileage + "]";
	}

}

// # 38

class Book {
	private String bNa;
	private int pages;
	private String author;

	// 생성자
	public Book() {
		this("자바의 정석", 500, "남궁 성");
	}

	public Book(String bNa, int pages, String author) {
		this.bNa = bNa;
		this.pages = pages;
		this.author = author;
	}

	// setter/getter
	public String getbNa() {
		return bNa;
	}

	public void setbNa(String bNa) {
		this.bNa = bNa;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// toString
	@Override
	public String toString() {
		return "Book [bNa=" + bNa + ", pages=" + pages + ", author=" + author + "]";
	}

}

class Magazine {
	// 매개변수
	private String bNa;
	private int pages;
	private String author;
	private String issDa;

	// 생성자
	public Magazine() {
		this("자바의 정석", 500, "남궁 성", "2017-12");
	}

	public Magazine(String bNa, int pages, String author, String issDa) {
		this.bNa = bNa;
		this.pages = pages;
		this.author = author;
		this.issDa = issDa;
	}

	// setter/getter
	public String getbNa() {
		return bNa;
	}

	public void setbNa(String bNa) {
		this.bNa = bNa;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIssDa() {
		return issDa;
	}

	public void setIssDa(String issDa) {
		this.issDa = issDa;
	}

	// toString
	@Override
	public String toString() {
		return "Magazine [bNa=" + bNa + ", pages=" + pages + ", author=" + author + ", issDa=" + issDa + "]";
	}

}

// # 39

class Phone {
	// 매개변수
	private String maker;
	private long price;
	private String type;

	// 생성자
	public Phone() {
		this("LG", 500000, "4G");
	}

	public Phone(String maker, long price, String type) {
		this.maker = maker;
		this.price = price;
		this.type = type;
	}

	// setter/getter
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// toString
	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + ", type=" + type + "]";
	}

}

class SmartPhone {
	// 매개변수
	private String maker;
	private long price;
	private String type;
	private String ver;
	private long memSize;
	private boolean isCam;
	private boolean isBT;

	// 생성자
	public SmartPhone() {
		this("LG", 500000, "4G", "Jelly Bean", 2048, true, true);
	}

	public SmartPhone(String maker, long price, String type, String ver, long memSize, boolean isCam, boolean isBT) {
		this.maker = maker;
		this.price = price;
		this.type = type;
		this.ver = ver;
		this.memSize = memSize;
		this.isCam = isCam;
		this.isBT = isBT;
	}

	// setter/getter
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public long getMemSize() {
		return memSize;
	}

	public void setMemSize(long memSize) {
		this.memSize = memSize;
	}

	public boolean isCam() {
		return isCam;
	}

	public void setCam(boolean isCam) {
		this.isCam = isCam;
	}

	public boolean isBT() {
		return isBT;
	}

	public void setBT(boolean isBT) {
		this.isBT = isBT;
	}

	// toString
	@Override
	public String toString() {
		return "SmartPhone [maker=" + maker + ", price=" + price + ", type=" + type + ", ver=" + ver + ", memSize="
				+ memSize + ", isCam=" + isCam + ", isBT=" + isBT + "]";
	}

}