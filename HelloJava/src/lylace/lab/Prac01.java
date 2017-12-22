package lylace.lab;

public class Prac01 {
	public static void main(String[] args) {
		long regNo = 1234561234567L; // 2-2번

		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('A' + 'B');
		System.out.println('J' + "ava");

		int i = 1;
		i |= 10;
		System.out.println(toBinaryString(10));
		System.out.println(toBinaryString(1));
		System.out.println(i);

		String userid, passwd;
		userid = "zzyzzy";
		passwd = "987654";
		System.out.println(userid.equals("zzyzzy") && passwd.equals("987654"));

		char c = '0';

		System.out.println((int) '0' <= c && c <= (int) '9');

	} // end of main

	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}

}
