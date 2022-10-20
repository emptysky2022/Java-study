package exam.SYJo_ex03;

import java.util.Arrays;
import java.util.Comparator;

public class BookTest {
	public static void main(String[] args) {
		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

		System.out.println("정렬 전");
		for (Book b : books)
			b.show();

		System.out.println("정렬 후");
		Arrays.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.price - o2.price;
			}
		});
		for (Book b : books)
			b.show();

	}
}
