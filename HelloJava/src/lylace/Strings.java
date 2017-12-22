package lylace;

public class Strings {

	public static void main(String[] args) {
		// Strings, StringBuffer 주요 메서드
		String s = "Hello";
		String n = "0123456";
		char c = s.charAt(1);
		char c2 = n.charAt(2);

		System.out.println(c);
		System.out.println(c2);

		s = "abcedfg";
		boolean b = s.contains("cedf");

		System.out.println(b);

		s = "Hello";
		b = s.equalsIgnoreCase("hELLO");
		boolean b2 = s.equalsIgnoreCase("heLLo");

		System.out.println(b);
		System.out.println(b2);

		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');

		System.out.println(idx1);
		System.out.println(idx2);

		idx1 = s.indexOf('H', 0);
		idx2 = s.indexOf('e', 2);

		System.out.println(idx1);
		System.out.println(idx2);

		s = "ABCDEFG";
		int idx = s.indexOf("CD");

		System.out.println(idx);

		s = "java.lang.Object";
		idx1 = s.lastIndexOf('.');
		idx2 = s.indexOf('.');

		System.out.println(idx1);
		System.out.println(idx2);

		s = "java.lang.java";
		idx1 = s.lastIndexOf("java");
		idx2 = s.indexOf("java");

		System.out.println(idx1);
		System.out.println(idx2);

		int length = s.length();

		System.out.println(length);

		s = "Hello";
		String s1 = s.replace('H', 'C');

		System.out.println(s1);

		s = "Hellollo";
		s1 = s.replace("ll", "PP");

		System.out.println(s1);

	}

}
