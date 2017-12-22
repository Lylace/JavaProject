package lylace;

public class DefaultInterface {

	public static void main(String[] args) {
		// 인터페이스의 업캐스팅
		SportsCar sc = new SportsCar();
		sc.move();
		sc.openRoof();

		// Movalbe isc = new Movalbe(); //불가
		Movalbe isc = new SportsCar();
		isc.move();
		// isc.openRoof(); // SportsCar에만 존재

		// 다운캐스팅
		SportsCar spc = (SportsCar) isc;
		spc.openRoof();

	}

}

interface A {
	void sayHello();

	// void sayHello(String msg);
	default void sayHello(String msg) {
	} // defualt 메서드 - JDK8부터 지원
}

class X implements A {

	@Override
	public void sayHello() {
	}

}

class Y implements A {

	@Override
	public void sayHello() {
	}

	@Override
	public void sayHello(String msg) {
	}

}

// 업캐스팅 테스트 예제
interface Movalbe {
	void move();
}

class SportsCar implements Movalbe {

	@Override
	public void move() {
	}

	public void openRoof() {
	}

}
