package project.v1;

public interface SungJukService {
	// 성적 데이터 CRUD 처리 - 저장,조회,수정,삭제

	void addSungJuk(SungJukVO sj);

	String getSungJuk();

	String getSungJuk(String name);

	void modifySungJuk(SungJukVO sj);

	void removeSungJuk(String name);

}
