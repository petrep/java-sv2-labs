package stringtype;

public class StringTypeMain {
	public static void main(String[] args) {
		String prefix = "Hello ";
		System.out.println(prefix);

		String name = "John Doe";
		System.out.println(name);

		String message = prefix + name;
		System.out.println(message);

		message += "444";
		System.out.println(message);

		boolean b = message.equals("Hello John Doe");
		System.out.println(b);

		boolean c = message.equals("Hello John Doe444");
		System.out.println(c);

		String emptyString1 = "";
		String emptyString2 = "";
		String concatenatedString = emptyString1+emptyString2;
		System.out.println(concatenatedString);
		System.out.println(concatenatedString.length());

		String abcde = "Abcde";
		System.out.println(abcde.length());
		System.out.println(abcde.charAt(0) + "," + abcde.charAt(2));
		System.out.println(abcde.substring(0, 2));


	}

}
