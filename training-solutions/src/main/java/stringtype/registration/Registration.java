package stringtype.registration;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		UserValidator uv = new UserValidator();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kérlek add meg a felhasználónevet:");
		String userName = scanner.nextLine();
		System.out.print("Az általad megadott adat: ");
		String verifiedUserName = (uv.isValidUsername(userName)) ? "helyes" : "helytelen";
		System.out.println(verifiedUserName);

		System.out.println("Kérlek add meg a jelszavadat:");
		String password1 = scanner.nextLine();
		System.out.println("Kérlek ismét add meg a jelszavadat:");
		String password2 = scanner.nextLine();
		System.out.print("Az általad megadott adat: ");
		String verifiedPw = (uv.isValidPassword(password1, password2)) ? "helyes" : "helytelen";
		System.out.println(verifiedPw);

		System.out.println("Kérlek add meg az email címedet:");
		String email = scanner.nextLine();
		System.out.print("Az általad megadott adat: ");
		String verifiedEmail = (uv.isValidEmail(email)) ? "helyes" : "helytelen";
		System.out.println(verifiedEmail);
	}
}
