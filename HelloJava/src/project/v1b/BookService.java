package project.v1b;

public interface BookService {
	void addBook(BookVO b);

	String getBook();

	String getBook(String bTi);

	void modifyBook(BookVO b);

	void removeBook(String bTi);
}
