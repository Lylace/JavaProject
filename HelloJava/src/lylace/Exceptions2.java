package lylace;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) {
		// 예외처리2 - 멀티 catch 블럭
		// 각각의 코드에 try-catch를 사용하는 것보다
		// 하나의 try-catch 블럭을 사용하고
		// 여러 개의 catch 문으로 예외를 처리하는 것이 효율적

		try {
			int[] intArray = { 9, 8, 7, 6, 5 };
			System.out.println(intArray[5]);

			int x = 1000 / 0;

			FileReader fr = new FileReader("");

			DriverManager.getConnection("...");
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("잘못된 배열사용!");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식사용");
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일경로를 제대로 설정하시오");
		} catch (SQLException se) {
			System.out.println("DB 서버주소를 설정하세요.");
		} catch (Exception ex) {
			System.out.println("예상치 못한 예외발생!");
		}

		// 예외 던지기 throws
		MakeException me = new MakeException();
		try {
			me.exception1();
			me.exception2(); // try문 안 에서도 예외발생시 건너 뛰고 catch문 실행
		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println("잘못된 배열사용!");
		}

		try {
			me.exception2();
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식사용!");
		}

		try {
			me.exception3();
		} catch (java.util.InputMismatchException ime) {
			System.out.println("숫자만 입력가능!");
		}

		// finally 블럭
		// 오류가 발생해서 예외처리시
		// 나머지 코드를 싱핼하지 않고 넘어감
		// 이런 코드들 중 반드시 실행해야 할 경우
		// finally 블럭에 작성하면 됨
		try {
			// DB 서버 연결
			// SQL 처리 및 기타작업
		} catch (Exception ex) {
			System.out.println("예외 처리함");
		} finally {
			// DB 서버 연결 끊음
		}

	}

}

class MakeException {
	public void exception1() throws ArrayIndexOutOfBoundsException {
		int[] intArray = { 9, 8, 7, 6, 5 };
		System.out.println(intArray[5]);
	}

	public void exception2() throws ArithmeticException {
		int x = 1000 / 0;
	}

	public void exception3() throws java.util.InputMismatchException {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
	}
}
