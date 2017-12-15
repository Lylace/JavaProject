package lylace;

import java.util.Scanner;

public class Statements3 {

	public static void main(String[] args) {
		// 반복문 - while

		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println("오늘 너무 추워요~");
			++i; // 증감식
		}

		// 무한루프
		// while (true) {
		// System.out.println("오늘 너무 추워요~");
		// }

		// 구구단
		String fmt = "%d x %d = %d\n";

		int dan = 5;
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, dan, i, dan * i);
			++i;
		}

		// 한번도 실행 안된다고? (조건이 다르면 한번도 실행 안함)
		i = 9;
		while (i > 10) {
			System.out.println("while: 이 글이 보이나요?");
		}

		// 하지만, 이건 달라요~ (조건이 안 맞아도 한번은 실행)

		i = 9;
		do {
			System.out.println("do-while: 이 글이 보이나요?");
		} while (i > 10);

		// 별 출력
		// *****
		// *****
		// *****
		// *****
		// *****

		i = 1;
		int j = 1;
		while (i++ <= 5) {
			while (j++ <= 5) {
				System.out.print("*");
			}
			System.out.print("\n");
			j = 1;
		}

		// 직각 삼각형 출력
		// *
		// **
		// ***
		// ****
		// *****

		i = 1;
		j = 1;
		while (i++ <= 5) {
			while (j++ <= i) {
				System.out.print("*");
			}
			System.out.print("\n");
			j = 1;
		}

		// 직각 삼각형 출력
		// *****
		// ****
		// ***
		// **
		// *

		i = 1;
		j = 1;
		while (i++ <= 5) {
			while (j++ <= 5) {
				System.out.print("*");
			}
			System.out.print("\n");
			j = i;
		}

		// 반복의 중단 - break
		i = 1;
		int sum = 0;
		fmt = "i : %d, sum : %d\n";
		while (true) {
			if (sum > 100) {
				System.out.printf(fmt, i, sum);
				break;
			}
			sum += ++i;
		}

		// 반복의 재시작 - continue
		i = 1;
		while (i++ <= 100) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}

		// while문의 조금 다른 용도
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("작업할 코드를 입력하세요");
			System.out.println("c)reate : 회원등록");
			System.out.println("r)ead : 회원조회");
			System.out.println("u)pdate : 회원수정");
			System.out.println("d)elete : 회원삭제");
			System.out.println("q)uit : 프로그램 종료");
			System.out.print(">>>>> ");

			String job = sc.nextLine();

			// q가 입력되면 while문에서 나감
			// if (job.equals("q")) break;

			switch (job) {
			case "c":
				System.out.println("<회원등록 메뉴를 선택>");
				break;
			case "r":
				System.out.println("<회원등록 메뉴를 선택>");
				break;
			case "u":
				System.out.println("<회원등록 메뉴를 선택>");
				break;
			case "d":
				System.out.println("<회원등록 메뉴를 선택>");
				break;
			case "q":
				System.exit(0);
				break;
			}
		}

	}

}
