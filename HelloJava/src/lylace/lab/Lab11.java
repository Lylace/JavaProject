package lylace.lab;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		// 프린트 31, 32, 35

		// # 31 - 은행정보와 카드 정보 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("6자리 카드번호를 입력하세요");
		String card = sc.nextLine();

		// 카드정보 판별
		char ctype = card.charAt(0);
		String ctmsg = "카드정보 없음";

		if (ctype == '3' && card.charAt(1) == '5')
			ctmsg = "JCB 카드";
		else if (ctype == '4')
			ctmsg = "Visa 카드";
		else if (ctype == '5')
			ctmsg = "Master 카드";

		// 은행정보 판별
		String bank = "은행정보 없음";
		switch (card) {
		case "356317":
			bank = "NH농협카드";
			break;
		case "356901":
			bank = "신한카드";
			break;
		case "356912":
			bank = "KB국민카드";
			break;
		case "404825":
			bank = "비씨카드";
			break;
		case "438676":
			bank = "신한카드";
			break;
		case "457973":
			bank = "국민카드";
			break;
		case "515594":
			bank = "신한카드";
			break;
		case "524353":
			bank = "외환카드";
			break;
		case "540926":
			bank = "국민카드";
			break;
		}

		System.out.printf("%s , %s\n", ctmsg, bank);

		// # 32 주민등록번호의 유효성 검사
		String jumin = "1111111111118";

		// a~b. 가중치 적용 및 합산
		int sum = 0;
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		// sum += (jumin.charAt(0) - '0') * 2;
		// sum += (jumin.charAt(1) - '0') * 3;
		// sum += (jumin.charAt(2) - '0') * 4;
		// sum += (jumin.charAt(3) - '0') * 5;
		// sum += (jumin.charAt(4) - '0') * 6;
		// sum += (jumin.charAt(5) - '0') * 7;
		// sum += (jumin.charAt(6) - '0') * 8;
		// sum += (jumin.charAt(7) - '0') * 9;
		// sum += (jumin.charAt(8) - '0') * 2;
		// sum += (jumin.charAt(9) - '0') * 3;
		// sum += (jumin.charAt(10) - '0') * 4;
		// sum += (jumin.charAt(11) - '0') * 5;

		for (int i = 0, j = 2; i < 12; i++, j++) {
			if (i == 8)
				j = 2;
			int jcode = jumin.charAt(i) - '0';
			sum += jcode * j;
		}

		// 나머지 계산
		// int check = sum % 11;

		// 마지막 자릿수와 비교
		String msg = "유효한 주민번호가 아닙니다";
		// if (check > 9) { // 나머지가 2자리수
		// if (check % 10 == jumin.charAt(12) - '0')
		// msg = "주민번호 검증 성공!";
		// } else if ((11 - check) == jumin.charAt(12) - '0')
		// msg = "주민번호 검증 성공!";

		int check = (11 - (sum % 11)) % 10;
		if (check == jumin.charAt(12) - '0')
			msg = "주민번호 검증 성공!";

		// 결과출력
		System.out.println(msg);

	} // end of main
} // end of class
