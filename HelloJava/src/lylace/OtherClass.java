package lylace;

import lylace.lab.SungJukMain;
import lylace.lab.SungJukService;

//import lylace.lab.*; - 경로상 전체 다

public class OtherClass {

	public static void main(String[] args) {
		// 다른 클래스 사용하기
		// 같은 패키지 내 다른 클래스는 별 다른 과정 없이 바로 사용 가능
		Overloads o = new Overloads();
		Overrides r = new Overrides();

		// 다른 패키지 클래스 사용하기
		// 해당 클래스가 존재하는 패키지경로를 모두 기술해야만 사용 가능
		lylace.lab.SungJukV1 sj = new lylace.lab.SungJukV1();

		// 다른 패키지 클래스 사용하기
		// import문을 사용하면 편리하게 다른 패키지 상의
		// 클래스를 사용할 수 있음
		SungJukService sjsrv = new SungJukService();
		SungJukMain sjm = new SungJukMain();

	}

}
