package lylace;

public class Overloads {

	public static void main(String[] args) {
		// 메서드 오버로딩 - 다중 정의
		Calculator c = new Calculator();
		String a = "abc", b = "def";
		double d = 0.123, e = 4.567;
		System.out.println(c.add(a, b));
		System.out.println(c.add(d, e));
	}

}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	} // 정수 더하기

	public double add(double a, double b) {
		return a + b;
	} // 실수 더하기

	public String add(String a, String b) {
		return a + b;
	} // 문자열 더하기(연결)

}