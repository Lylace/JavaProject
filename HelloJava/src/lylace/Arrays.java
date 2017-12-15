package lylace;

public class Arrays {

	public static void main(String[] args) {
		// 배열 - 동일한 타입의 데이터들의 묶음
		String name1, name2, name3;

		// 배열 선언
		// 타입[] 변수명;
		String[] names;

		// 배열 초기화
		// 변수명 = new 자료형[길이];
		names = new String[3];

		// 배열 다루기
		// 변수명[위치값];
		names[0] = "혜교";
		names[1] = "지현";
		names[2] = "수지";

		// System.out.println(names[0]);
		// System.out.println(names[1]);
		// System.out.println(names[2]);

		for (int i = 0; i < names.length; i++) { // 배열에서는 .length 길이를 말함.
			System.out.println(names[i]);
		}

		int[] kor;
		kor = new int[3];

		kor[0] = 98;
		kor[1] = 87;
		kor[2] = 75;

		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}

		// 배열은 참조형이다????
		System.out.println(names); // 메모리 할당 주소값 나옴
		System.out.println(kor);

		// 배열요소의 값은 자동으로 초기화된다
		String[] a = new String[1]; // 객체, 참조타입
		int[] b = new int[1];
		char[] c = new char[1];
		double[] d = new double[1];
		boolean[] e = new boolean[1];
		Arrays2[] z = new Arrays2[1]; // 객체, 참조타입

		System.out.println(a[0]); // null
		System.out.println(b[0]); // 0
		System.out.println(c[0]); //
		System.out.println(d[0]); // 0.0
		System.out.println(e[0]); // false
		System.out.println(z[0]); // null

		// 배열의 길이 : 배열변수.length
		// names.length = 10; // 상수이므로 변경x

		// 배열의 선언과 동시에 초기화하기
		int[] f = { 99, 77, 65 };

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}

		f = new int[] { 99, 99, 99 };

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}

		// 2차원 배열 : [][] - 행렬
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15; // 처음
		lotto[2][5] = 33; // 끝

		// 1 ~ 45 정수를 6개 출력하는 난수 코드 작성
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 6; i++) {
				int ran = (int) (Math.random() * 100000);
				int lotto645 = ran % ((45 - 1) + 1) + 1;
				// System.out.printf(" %2d ", lotto645);
				lotto[j][i] = lotto645;
			} // for i

		} // for j

		// 2차원 배열 내 저장된 값 출력
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.printf(" %2d ", lotto[j][i]);
			} // for i
			System.out.println();
		} // for j

		// 향상된 for 문으로 배열 다루기
		// for(배열요소타입 변수명 : 배열)
		int[] abc = { 12, 34, 56, 78, 90 };
		for (int val : abc) {
			System.out.println(val);
		}

		// 2차원 배열에 대한 향상된 for문 사용
		for (int[] row : lotto) {
			for (int col : row) {
				System.out.printf(" %2d ", col);
			}
			System.out.println();
		}
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}

	}

}

class Arrays2 {
}
