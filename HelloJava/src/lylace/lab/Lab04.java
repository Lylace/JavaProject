package lylace.lab;

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		// 프린트 문제 16 - 20

		// # 16 a.
		// int n = 1, k = 2, r = n;
		// if (k < n)
		// r = k;
		// System.out.printf("%d %d %d%n",n,k,r);

		// # 16 b.
		// int n = 1, k = 2, r;
		// if (n < k)
		// r = k;
		// else
		// r = k + n;
		// System.out.println(n);
		// System.out.println(k);
		// System.out.println(r);

		// # 16 c.
		// int n = 1, k = 2, r = k;
		// if (r < k)
		// n = r;
		// else
		// k = n;
		// System.out.println(n);
		// System.out.println(k);
		// System.out.println(r);

		// # 16 d.
		// int n = 1, k = 2, r = 3;
		// if (r < n + k)
		// r = 2 * n;
		// else
		// k = 2 * r;
		// System.out.println(n);
		// System.out.println(k);
		// System.out.println(r);

		// # 17 a.
		// int x = 1, y = 1;
		// if (x && y == 0) { //맞게 하려면 x쪽을 boolean타입으로 해야됨.
		// x = 1;
		// y = 1;
		// }

		// # 17 b.
		// int x = 4;
		// if (1 <= x <= 10) //올바르게 하려면 && x 위와 같은 오류.
		// System.out.println(x);

		// # 18 a.
		// int number = 35;
		// if (number % 2 == 0)
		// System.out.println(number + " is even.");
		// System.out.println(number + " is odd.");

		// # 18 b.
		// int number = 30;
		// if (number % 2 == 0)
		// System.out.println(number + " is evne.");
		// else
		// System.out.println(number + " is odd.");

		// # 19
		// int x = 2, y = 2, z;
		// if (x > 2) {
		// if (y > 2) {
		// z = x + y;
		// System.out.println("z is " + z);
		// }
		// } else
		// System.out.println("x is " + x);

		// # 20
		// int a = 3;
		// if (a++ == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");
		// int a = 3;
		// if (++a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");
		// int a = 3;
		// a = a++;
		// a = a++;
		// if (a++ == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// # 21
		// 결혼여부 isMarried = "Y" , "N"
		// 결혼여부 isMarried = true , false
		// 결혼여부 isMarried = 0 , 1
		Scanner sc = new Scanner(System.in);
		System.out.println("결혼여부를 입력하세요. (미혼:0, 기혼:1)");
		int isMarried = sc.nextInt();
		System.out.println("연봉을 입력하세요.");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000) {
				tax = (int) (salary * 0.1);
			} else
				tax = (int) (salary * 0.25);
		} else if (salary < 6000) {
			tax = (int) (salary * 0.1);
		} else if (salary >= 6000) {
			tax = (int) (salary * 0.25);
		}

		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);
	}

}
