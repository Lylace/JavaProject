package lylace.lab;

import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		// 자바정석 예제 4-6, 4-7, 4-8

		// # 4-6
		System.out.print("현재 월을 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
			// case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
		}

		// 4-7
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");

	}

}
