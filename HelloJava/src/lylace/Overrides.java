package lylace;

public class Overrides {

	public static void main(String[] args) {
		// 메서드 오버라이드

	}

}

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() {
		return kor + eng + mat;
	}

	public double getAverage() {
		double avg = (kor + eng + mat) / 3.0;
		return avg;
		// return (double)getTotal()/3;
	}

	public char getGrade() {
		double avg = kor + eng + mat / 3.0;
		char grd = '가';
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;

		}
		return grd;
	}
}

class MidSungJuk2 extends SungJuk2 {
	protected int sci;
	protected int art;

	@Override // 메서드 재정의
	public int getTotal() {
		// return kor + eng + mat + sci + art;
		int tot = super.getTotal() + sci + art;
		return tot;
	}

	@Override
	public double getAverage() {
		// double avg = (kor + eng + mat + sci + art) / 5.0;
		double avg = getTotal() / 5.0;
		return avg;
	}

	@Override
	public char getGrade() {
		// double avg = (kor + eng + mat + sci + art) / 5.0;
		int avg = (int) getAverage() / 10;
		char grd = '가';
		switch (avg) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		}
		return grd;

	}

}