package project.v1;

public class SungJukServiceImpl implements SungJukService {

	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuK(sj); // 성적처리 - 총점, 평균, 학점
		System.out.println("새로운 성적데이터가 추가되었습니다.");
	}

	@Override
	public String getSungJuk() {
		String out = "성적데이터 출력합니다.";
		return out;
	}

	@Override
	public String getSungJuk(String name) {
		return name;
	}

	@Override
	public void modifySungJuk(SungJukVO sj) {
		System.out.println("성적데이터가 수정되었습니다.");
	}

	@Override
	public void removeSungJuk(String name) {
		System.out.println("성적데이터가 삭제되었습니다.");
	}

	private void processSungJuK(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = tot / 3.0;
		String grd = "가";
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);

	}

}
