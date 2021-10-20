package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
	public static void main(String[] args) {
		Prefix prefix = new Prefix("Mr.");
		FirstName firstName = new FirstName("Fritz");
		LastName lastName = new LastName("Teufel");

		System.out.println(
			prefix.getPre() + " " +
			firstName.getFirst() + " " +
			lastName.getLast() + " "
		);
	}
}
