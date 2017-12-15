package lylace.lab;

public class Lab02 {
	public static void main(String[] arg) {
		// #3 ~ #15

		// #3
		// int x, y, z;
		// 3 * x
		// 3 * x + y
		// (x + y) / 7
		// (3 * x + y) / (z + 2)

		// #4
		// double number = (1 / 3) * 3;
		// 숫자 default값이 int이므로 1/3 은 0으로 되므로
		// 0*3 = 0 인데 변수타입이 double로 되어있으므로 0.0
		// System.out.printf("(1/3) * 3 = %1.0f%n", (1d / 3) * 3);//가까운 값을 구하는 식

		// #5
		// int quotient, remainder;
		// quotient = 7 / 3;
		// remainder = 7 % 3;
		// System.out.println(quotient); // int 타입이라 정수부분인 2만 남음
		// System.out.println(remainder);

		// // #6
		// int result = 11;
		// result /= 2; // /= 대입연산자 11/2 이고, int 타입이라 정수부분인 5만 남음
		// System.out.println(result);

		// #7

		// double x = 2.5, y = -1.5;
		// int m = 18, n = 4;
		// System.out.println(x + n * y - (x + n) * y);
		// System.out.println(m / n + m % n);
		// System.out.println(5 * x - n / 5);
		// System.out.println(1 - (1 - (1 - (1 - (1 - n)))));

		// #8 논리 연산자의 단축평가
		// System.out.println(true||);

		// #9 - 문자열로 처리
		// System.out.print("May 13, 1988 fell on day number\n");
		// System.out.println(
		// ((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 *
		// (1988 / 100)) % 7 + 7) % 7);
		// // 특정일의 요일을 알아내는 수식
		// int year = 1988, month = 5, day = 13;
		// System.out.println((year + (year / 4) - (year / 100) + (year / 400) + (13 *
		// month + 8) / 5 + day) % 7);
		// System.out.println("//hello there" + '9' + 7); // 문자열 + 문자 = 문자열, 문자 + 문자 =
		// 코드 숫자계산
		// System.out.println("Not x is" + true);// 문자열 + boolean타입 키워드 = 문자열
		//
		// // #12 형변환 : 축소
		// int n = (int) 3.9;
		// System.out.println("n ==" + n);
		// // #13 증가 감소 연산자
		// int p = 3;
		// p++;
		// System.out.println("p ==" + p);
		// p--;
		// System.out.println("p ==" + p);
		// #15
		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) 'a');
		System.out.println((int) a);
	}

}
