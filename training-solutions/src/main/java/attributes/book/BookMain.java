package attributes.book;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("Az ember, akit Ovénak hívnak");
		System.out.println(book.getTitle());

		book.setTitle("A nagymamám azt üzeni, bocs");
		System.out.println(book.getTitle());
	}
}
