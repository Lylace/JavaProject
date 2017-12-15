package lylace;

public class Statements2 {

	public static void main(String[] args) {
		//
		// System.out.println("오늘 너무 추워요~");
		// System.out.println("오늘 너무 추워요~");
		// System.out.println("오늘 너무 추워요~");
		// System.out.println("오늘 너무 추워요~");
		// System.out.println("오늘 너무 추워요~");
		//
		// System.out.println("1");
		// System.out.println("2");
		// System.out.println("3");
		// System.out.println("4");
		// System.out.println("5");
		// // 단순무식하게 복붙 코드로 반복작업을 수행하는 것은
		// // 유지보수 측면으로 볼 때 좋은 방법이 아님
		//
		// // 반복문
		// // for - 지정한 횟수만큼 어떤 작업을 반복
		// for (int i = 1; i <= 5; ++i) {
		// // for (int i = 1; i <= 5; i = i + 1) {
		// // for (int i = 1; i <= 5; i += 1) {
		// System.out.println("오늘 너무 추워요~");
		// }
		//
		// for (int i = 1; i <= 5; ++i) {
		// System.out.println(i);
		// }
		//
		// // 1 ~ 100까지 정수 출력
		// System.out.println("1~100까지 정수 출력");
		// for (int i = 1; i <= 100; ++i) {
		// System.out.println(i);
		// }
		//
		// // 1 ~ 100까지 홀수 출력
		// System.out.println("1~100까지 홀수 출력");
		// // for (int i = 1; i <= 100; ++i) {
		// // if (i % 2 == 1) {
		// // System.out.println(i);
		// // }
		// // }
		// for (int i = 1; i <= 100; i += 2) {
		// System.out.println(i);
		// }
		// // 1 ~ 100까지 짝수 출력
		// System.out.println("1~100까지 짝수 출력");
		// for (int i = 2; i <= 100; i += 2) {
		//
		// System.out.println(i);
		// }
		//
		// // 구구단
		// // 5*1 = 5
		// // ....
		// // 5*9 = 45
		//
		// String fmt = "%d x %d = %d%n";
		// for (int i = 1, j = 5; i <= 9; ++i) {
		// System.out.printf(fmt, j, i, i * j);
		// }

		// 중첩 for문
		// **********
		// **********
		// **********
		// **********
		// **********

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 직각삼각형 그리기
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 직각삼각형 그리기
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
