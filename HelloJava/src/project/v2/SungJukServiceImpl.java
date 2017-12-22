package project.v2;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

public class SungJukServiceImpl implements SungJukService {

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb;

	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}

	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuK(sj);
		sjdb.add(sj);
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d\n";
		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}
		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n잘못된 값 입력!!";

		SungJukVO sj = sjdb.get(no - 1);

		StringBuffer sb = new StringBuffer();
		sb.append(String.format("\n\n%d : %s %d %d %d %d %.1f %s", no, sj.getName(), sj.getKor(), sj.getEng(),
				sj.getMat(), sj.getTot(), sj.getAvrg(), sj.getGrd()));

		return sb.toString();
	}

	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println("\n잘못 입력하셨습니다!!\n\n\n");
			return;
		}

		processSungJuK(sj);
		sjdb.set(no - 1, sj);
	}

	@Override
	public void removeSungJuk(int no) {
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
