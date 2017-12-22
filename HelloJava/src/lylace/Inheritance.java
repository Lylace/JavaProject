package lylace;

public class Inheritance {

	public static void main(String[] args) {
		// 클래스간 상속관계가 형성되면 각 클래스는 is-a 관계가 된다
		// 자식 클래스의 객체는 부모 클래스 타입으로 처리 가능

		Tiger t = new Tiger();
		Animals t2 = new Tiger();

		Animals e = new Eagle();

		Animals g = new Goldfish();

	}

}

class Animals extends Object {
	String eye;
	String mouth;
	protected String hp;

	public void eat() {

	}

	public void sleep() {

	}
}

class Tiger extends Animals {
	String legs;

	public void run() {

	}
}

class Eagle extends Animals {
	String wings;

	public void fly() {

	}
}

class Goldfish extends Animals {
	String fins;

	public void swim() {

	}
}