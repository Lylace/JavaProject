package project.v1b;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook(BookVO b) {
		System.out.println("도서정보가 등록되었습니다.");
	}

	@Override
	public String getBook() {
		String out = "도서정보를 출력합니다.";
		return out;
	}

	@Override
	public String getBook(String bTi) {
		return bTi;
	}

	@Override
	public void modifyBook(BookVO b) {
		System.out.println("도서정보가 수정되었습니다.");
	}

	@Override
	public void removeBook(String bTi) {
		System.out.println("도서정보가 삭제되었습니다.");
	}

}
