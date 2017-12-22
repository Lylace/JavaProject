package lylace.lab;

public class Lab18 {

	public static void main(String[] args) {
		// 연습문제 7-7~10, 7-15, 7-17, 8-2, 8-8

		// # 7-7
		Child0 c0 = new Child0();
		System.out.println(c0.getX());

	}

}

// # 7-7

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}

}

class Child0 extends Parent {
	int x = 3000;

	Child0() {
		this(1000);
	}

	Child0(int x) {
		this.x = x;
	}

}