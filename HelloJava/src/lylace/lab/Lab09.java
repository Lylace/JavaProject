package lylace.lab;

import java.util.Scanner;

public class Lab09 {

	public static void main(String[] args) {
		// 교재소스 5-6, 5-10, 5-11, 5-20, 5-21

		// # 5-6

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // end of for

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println();
		// # 5-10

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로.
				}
			} // end for j
			if (!changed)
				break; // 자리바꿈이 없으면 반복문을 벗어난다.

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]);
			System.out.println();
		} // end for i
		System.out.println();

		// # 5-11

		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
		System.out.println();

		// # 5-20

		final int SIZE = 10;
		int x = 0, y = 0;
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				// 1 2 3 4 5 6 7 8 9
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		};
		// 1행에 행번호를, 1열에 열번호를 저장한다.
		for (int i = 1; i < SIZE; i++)
			board[0][i] = board[i][0] = (char) (i + '0');

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input = sc.nextLine(); // 화면에 입력받은 내용을 input에 저장

			if (input.length() == 2) { // 두 글자를 입력한 경우
				x = input.charAt(0) - '0'; // 문자를 숫자로 변환
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0) // x와 y가 모두 0인 경우 종료
					break;
			}

			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}

			// shipBoard[x-1][y-1]의 값이 1이면, 'O'를 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

			// 배열 board의 내용을 화면에 출력한다.
			for (int i = 0; i < SIZE; i++)
				System.out.println(board[i]); // board[i]는 1차원 배열
			System.out.println();

		}

	} // end of main

} // end of class
