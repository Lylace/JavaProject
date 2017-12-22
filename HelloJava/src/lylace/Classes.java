package lylace;

import lylace.lab.SungJukVO;

public class Classes {

	public static void main(String[] args) {
		// 클래스 - 객체를 만들기 위한 틀, 설계도
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.weight = 150;
		tiger.gender = "남자";
		tiger.type = "호랑이";

		tiger.move();
		tiger.eat();

		System.out.println(tiger.name);
		System.out.println(tiger.weight + "kg");
		System.out.println(tiger.gender);
		System.out.println(tiger.type);

		// shark
		Animal shark = new Animal();
		shark.name = "상돌이";
		shark.weight = 450;
		shark.gender = "남자";
		shark.type = "상어";

		shark.move();
		shark.eat();

		System.out.println(shark.name);
		System.out.println(shark.weight + "kg");
		System.out.println(shark.gender);
		System.out.println(shark.type);

		// eagle
		Animal eagle = new Animal();
		eagle.name = "독순이";
		eagle.weight = 70;
		eagle.gender = "여자";
		eagle.type = "독수리";

		eagle.move();
		eagle.eat();

		System.out.println(eagle.name);
		System.out.println(eagle.weight + "kg");
		System.out.println(eagle.gender);
		System.out.println(eagle.type);

		Animal tiger2 = new Animal();

		System.out.println(tiger2.name);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.weight);
		System.out.println(tiger2.type);

		Animal cat = new Animal();
		cat = new Animal("고순이", 25, "여자", "고양이");

		System.out.println(cat.name);
		System.out.println(cat.type);

		// 회원가입

		Member m = new Member("zzyzzy", "987654", "혜교", "abc123@xyz987.com", "2017-12-18");

		// SungJukV0 클래스를 이용하기

		SungJukVO sj = new SungJukVO("혜교", 99, 98, 78);
		System.out.printf("%s %d %d %d\n", sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
		System.out.println(sj);
	} // end of main

}

class Animal { // 동물 클래스
	// 필드 (멤버변수)
	String name;
	int weight;
	String gender;
	String type;

	// 기본 생성자
	public Animal() {
	}

	// 매개변수 있는 생성자

	public Animal(String name, int weight, String gender, String type) {
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}

	// setter/getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 메서드
	void move() {
		System.out.println(name + "가 움직였다");
	}

	void eat() {
		System.out.println(name + "가 먹이를 먹었다");
	}

}

class Car {
	String name;
	int size;

	// 클래스는 클래스의 멤버변수로 선언가능
	Engine engine;
	Door door;
	Wheel wheel;
}

class Engine {
}

class Door {
}

class Wheel {
}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	// 기본생성자
	Member() {
	}

	// 매개변수 있는 생성자
	Member(String userid, String passwd, String name, String email, String regdate) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

}
