package lylace.lab;

import java.io.IOException;
import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) throws IOException {
		// 연습문제 22,(23),25,(26),27,28,(29),30

		// # 22 - 윤년 여부 확인
		// 현재 연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음
		// 현재 연도가 400으로 나눠 떨어짐
		// GregorianCalendar gc = new GregorianCalendar();
		// int year = 2000;
		Scanner sc = new Scanner(System.in);
		// if (gc.isLeapYear(year)) {
		// System.out.printf("%d는 윤년입니다%n", year);
		// } else {
		// System.out.printf("%d는 윤년이 아닙니다%n", year);
		// }

		String welcome = "윤년을 확인할 연도를 입력하세요", fmt1 = "%d년은 윤년입니다%n", fmt2 = "%d년은 윤년이 아닙니다%n";

		System.out.println(welcome);
		int year = sc.nextInt();
		if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
			System.out.printf(fmt1, year);
			// } else if (year % 400 == 0) { // else if 대신에 if 하나에 넣을 수 있음.
			// System.out.printf("%d는 윤년입니다%n", year);
		} else {
			System.out.printf(fmt2, year);

		}

		// #23 - 복권 발행 프로그램
		// 특정범위를 포함하는 난수 생성
		// 정수난수값 % ((마지막값 - 시작값) + 1) + 시작값
		// 복권 숫자 범위 100 - 999
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치
		// lotto : 657, lucky : 123 = 0개 일치
		// lotto : 657, lucky : 726 = 2개 일치
		//
		// Scanner sc = new Scanner(System.in);
		//
		// int rand = (int) (Math.random() * 100000);
		// int lotto = rand % ((999 - 100) + 1) + 100;
		// System.out.println(lotto);
		//
		// String lucky = sc.nextLine();
		//
		// // 문자 하나씩 추출
		//
		// char lucky1 = lucky.charAt(0);
		// char lucky2 = lucky.charAt(1);
		// char lucky3 = lucky.charAt(2);
		//
		// char lotto1 = ("" + lotto).charAt(0);
		// char lotto2 = ("" + lotto).charAt(1);
		// char lotto3 = ("" + lotto).charAt(2);
		//
		// // 비교
		// int match = 0;
		// // if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3) {
		// // ++match;
		// // if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3) {
		// // ++match;
		// // if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3) {
		// // ++match;
		// // }
		// // }
		// // }
		//
		// String lotto4 = "" + lotto;
		// int size = lotto4.length();
		// for (int i = 0; i < size; i++) {
		// for (int j = 0; j < size; j++) {
		// if (lucky.charAt(i) == lotto4.charAt(j)) {
		// match++;
		// }
		// }
		//
		// }
		//
		// switch (match) {
		// case 1:
		// System.out.println("1개 일치! 상금 1천 지급");
		// break;
		// case 2:
		// System.out.println("2개 일치! 상금 1만 지급");
		// break;
		// case 3:
		// System.out.println("모두 일치! 상금 1백만 지급");
		// break;
		// default:
		// System.out.println("다음 기회에...");
		// break;
		// }

		// # 24
		// Scanner sc = new Scanner(System.in);
		// String welcome1 = "출력할 구구단의 단을 입력하시오(1-9)";
		// String error = "잘못 입력하셨습니다!!";
		// System.out.println(welcome1);
		//
		// int ggNo = sc1.nextInt();
		//
		// if ('1' >= ggNo && ggNo >= '9') {
		// System.out.println(error);
		// }
		// String fmt3 = "%d x %d = %2d%n";
		// for (int i = 1; i <= 9; i++) {
		// System.out.printf(fmt3, ggNo, i, ggNo * i);
		// }

		String welcome1 = "출력할 구구단의 단을 입력하시오(1-9)";
		String error = "잘못 입력하셨습니다!!";
		String fmt3 = "%d x %d = %2d\n";
		System.out.println(welcome1);
		int ggNo = System.in.read() - 48;

		if (1 <= ggNo && ggNo <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf(fmt3, ggNo, i, ggNo * i);
			}
		} else {
			System.out.println(error);
		}
		System.out.println(ggNo);

		// # 25 - 문자와 숫자 변환
		// 소문자 a : 97, 대문자 A : 65 유니코드값
		// System.out.println("소문자 알파벳을 대문자로 바꿔드립니다");
		// System.out.println("소문자 알파벳을 하나 입력하세요");
		// int ch = System.in.read();
		//
		// // 소문자 (a: 97, z : 122)
		// // 이외의 문자가 입력되면 경고메세지 출력
		//
		// // 소문자를 대문자로 변환하기 위해
		// // 입력한 문자에서 32만큼 빼고 처리
		//
		// if (97 <= ch && ch <= 122) {
		// System.out.println((char) (ch - 32));
		// } else {
		// System.out.println("잘못 입력하셨습니다!!");
		// }

		// // # 26 - 숫자 맞추기
		// sc = new Scanner(System.in); // 키보드로부터 데이터를 입력받을 준비를 함
		// int num2 = (int) (Math.random() * 100) + 1;
		// System.out.println("1-100사이의 정수를 입력하시오");
		// while (true) {
		// int num1 = sc.nextInt(); // 정수를 입력받음
		//
		// if (num1 > num2)
		// System.out.println("추측한 숫자가 큽니다");
		// else if (num1 < num2)
		// System.out.println("추측한 숫자가 작습니다");
		// else if (num1 == num2) {
		// System.out.println("빙고! 숫자를 맞췄습니다");
		// break;
		// }
		// }

		// # 27

		// int sum = 0, number = 0;
		//
		// while (number < 20) {
		// number++;
		// sum += number;
		// if (sum >= 100)
		// break; // number = 14 , sum = 105
		// }

		// # 28

		// while (number < 20) {
		// number++;
		// if (number == 10 || number == 11)
		// continue;
		// sum += number;
		// } // number = 20 , sum = 189

		// // # 30 - 구구단 차트

		// String fmt = "\t Multiplication Table\n";
		// fmt += " 1 2 3 4 5 6 7 8 9\n";
		// fmt += "----------------------------------------\n";
		// fmt += "1 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "2 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "3 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "4 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "5 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "6 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "7 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "8 | 1 2 3 4 5 6 7 8 9\n";
		// fmt += "9 | 1 2 3 4 5 6 7 8 9\n";
		// String rowTitle = "%d | ";
		// String rowVal = " %d";
		//
		// // System.out.printf(fmt);
		//
		// String fmt = "\t Multiplication Table\n";
		// fmt += " 1 2 3 4 5 6 7 8 9\n";
		// fmt += "----------------------------------------\n";
		//
		// System.out.println(fmt);
		// for (int i = 1; i <= 9; i++) {
		// fmt = "%d | %2d %2d %2d %2d %2d %2d %2d %2d %2d\n";
		// System.out.printf(fmt, i, 1 * i, 2 * i, 3 * i, 4 * i, 5 * i, 6 * i, 7 * i, 8
		// * i, 9 * i);
		// }
		//
		// String fmt = "\t Multiplication Table\n";
		// fmt += " 1 2 3 4 5 6 7 8 9\n";
		// fmt += "----------------------------------------\n";
		//
		// System.out.printf(fmt);
		// for (int i = 1; i <= 9; i++) {
		// System.out.printf("%d |", i);
		// for (int j = 1; j <= 9; j++) {
		// System.out.printf(" %2d", i * j);
		// }
		// System.out.println();
		// }
	}

}
