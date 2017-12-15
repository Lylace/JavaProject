package lylace;

import java.util.Scanner;

public class Variable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 자바 기본자료형 int : 정수(byte, short, long) double : 실수(float) char : 문자 1자 String :
		 * 문자열
		 */

		// 변수 : 자료형 변수이름;
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자 변수(1자)
		String d; // 문자열 변수

		// 상수 : final 자료형 변수이름;
		// 변경불가 자룔를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성
		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어(키워드)를 변수 이름으로 사용불가
		// int if;
		// double import;
		// char System; //비추천
		// String String; //비추천

		// 회원정보(아이디,비밀번호,이름,나이)
		String userid; // id, uid, 아이디
		String password; // pwd, passwd, 비밀번호
		String name;
		// String name, password, name;
		// 동일 타입일시 , 로 다중 변수 선언 가능 (비추 - 가독성문제)

		// String name="x", password="y", name="z"; 가능

		int age;

		// literal : 컴파일러가 이해할 수 있는 형식으로 작성된 데이터나 값
		// int jumin = 1234561234567; - 범위초과
		// long jumin = 1234561234567; - literal 값에 접미사 L 빠짐
		long jumin = 1234561234567L;

		// 변수 초기화
		// 변수명 = 값;
		userid = "zzyzzy";
		password = "987654";
		name = "suji";
		age = 23;

		b = 123.456;

		c = '가';
		G = 'a';

		// 변수 vs 상수

		c = '나';
		// G = 'b'; //상수이므로 변경 불가

		float pi = 3.145678f;

		// 선언과 초기화
		int i = 132;
		double j = 987.123;
		boolean k = true; // 논리형 변수
		k = false;
		// k = 123;
		// k = '가';

		// 변수/상수 이름
		// 변수는 일반적으로 소문자
		// 만일 이름을 두 단어로 구성하는 경우
		// camel 표기법을 사용
		int juminCode;
		String sayHello;

		// 상수는 모두 대문자로 작성
		// 두 단어 이상인 경우 각 단어를 _으로 이어 사용
		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "zzyzzy";

		// JDK7부터 도입된 자릿수 표시 : _
		jumin = 1234561324567L;
		jumin = 1_2345_6132_4567L;

		// 문자와 숫자 간 변환
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 'Z';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 'z';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '가';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '하';
		System.out.println(ch);
		System.out.println((int) ch);

		String chars = "abc";
		System.out.println(chars.charAt(0) + chars.charAt(1) + chars.charAt(2));
		System.out.println(chars);

		// 특수문자 표현 - escape sequence
		System.out.println("가          나");
		System.out.println("가\t나"); // 탭문자
		System.out.println("가\n나"); // 줄바꿈문자
		System.out.println("가\"나"); // 큰 따옴표 문자
		System.out.println("가'나"); // 작은 따옴표 문자 - 다른 기호 일때는 그냥 입력해도 가능
		System.out.println("가\'나"); // 작은 따옴표 문자

		// 변수에
		System.out.println("아이디 : " + userid);
		System.out.println("비밀번호 : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("아이디 : " + userid + "\n비밀번호 : " + password + "\n이름 : " + name + "\n나이 : " + age);

		// 서식화된 출력 -printf
		// 직접 넣기
		System.out.printf("아이디 : %s%n비밀번호 : %s%n이름 : %s%n나이 : %d%n", userid, password, name, age);
		// 새로운 변수 생성
		String fmt = "아이디 : %s%n비밀번호 : %s%n이름 : %s%n나이 : %d%n";
		System.out.printf(fmt, userid, password, name, age);

		// double vs float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;

		System.out.println(avg1);
		System.out.println(avg2);

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.println("  성적 처리프로그램 v1  ");
		System.out.println("-----------------");

		System.out.print("아이디를 입력하시오  : ");
		userid = sc.nextLine();
		System.out.print("비밀번호를 입력하시오 : ");
		password = sc.nextLine();
		System.out.print("이름을 입력하시오  : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하시오  : ");
		age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, userid, password, name, age);
	}

}
