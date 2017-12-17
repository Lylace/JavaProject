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

		sc = new Scanner(System.in);
		int user = sc.nextInt(); // 화면을 통해 입력받은 숫자를 user에 저장
		int com = (int) (Math.random() * 3) + 1; // 1, 2 ,3 중 하나가 com에 저장됨

		System.out.println("당신은  " + user + "입니다.");
		System.out.println("컴은  " + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신은 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신은 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			// break; // 마지막 문장이므로 break를 사용할 필요가 없다.
		}

	} // end of main

} // end of class
