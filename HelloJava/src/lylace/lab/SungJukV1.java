package lylace.lab;

import java.util.Scanner;

/*
       성적 처리프로그램V1
       간단한 성적처리를 수행하는 프로그램
       입력 : 이름, 국어, 영어, 수학
       처리 : 총점, 평균, 학점
       출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
*/
public class SungJukV1 {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int korean, english, math, total;
		double avg;
		char grd;
		String report = "이름 : %s%n국어 : %d%n영어 : %d%n수학 : %d%n총점 : %d%n평균 : %3.1f%n학점 : %c%n";
		// 데이터 입력 - 입력자료 하드코딩으로 먼저 테스트가 좋음
		Scanner sc = new Scanner(System.in);
		System.out.println("  성적 처리프로그램 v1  ");
		System.out.println("----------------");
		System.out.print("이름을 입력하시오.   ");
		name = sc.nextLine();
		System.out.print("국어 점수를 입력하시오.  ");
		korean = sc.nextInt();
		System.out.print("영어 점수를 입력하시오.  ");
		english = sc.nextInt();
		System.out.print("수학 점수를 입력하시오.  ");
		math = sc.nextInt();

		// Scanner 객체 닫기
		sc.close();

		total = korean + english + math;
		avg = total / 3.0;
		grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		System.out.printf(report, name, korean, english, math, total, avg, grd);

	}

}
