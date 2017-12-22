package project.v1b;

public class BookMain {

	public static void main(String[] args) {
		BookService bs = new BookServiceImpl();

		BookVO b = new BookVO(1, "축구의 역사", "굿스포츠", 7000);

		bs.addBook(b);
		System.out.println(b);

		b = new BookVO(1, "축구의 역사", "굿Sports", 7000);
		bs.modifyBook(b);
		System.out.println(b);

		bs.removeBook("축구의 역사");
	}

}
