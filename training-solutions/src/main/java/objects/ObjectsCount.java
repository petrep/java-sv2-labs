package objects;

public class ObjectsCount {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = book1;
		Book book5 = book1;
		Book book6 = book3;
		Book book7 = null;
		book4 = book6;
		new Book();
		book5 = new Book();
		book6 = null;
		book5 = book4;

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		System.out.println(book5);
		System.out.println(book6);
		System.out.println(book7);

		System.out.println("Five objects were created");
		System.out.println("3 objects are accessible");
	}
}
