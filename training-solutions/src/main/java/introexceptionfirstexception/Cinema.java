package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mozijegy vásárló alkalmazás");
		System.out.println("Kérlek írd be a neved: ");
		String name = scanner.nextLine();
		System.out.println("Kérlek írd be, hogy melyik filmre kérsz jegyet: ");
		String title = scanner.nextLine();
		System.out.println("Hány db jegyet szeretnél? ");
		int ticketCount = scanner.nextInt();
		System.out.println("Melyik sorba kéred a jegyeket? ");
		int lineNr = scanner.nextInt();

		StringBuilder reservedPlaces = new StringBuilder();
		for (int i = 1; i <= ticketCount; i++) {
			reservedPlaces.append(lineNr);
			reservedPlaces.append(". sor ");
			reservedPlaces.append(i);
			reservedPlaces.append(". szék, ");
		}


		System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
		System.out.println("Vásárló neve: " + name);
		System.out.println("Film címe: " + title);
		System.out.println("Lefoglalt helyek: " + reservedPlaces.substring(0, reservedPlaces.length()-2));
	}
}
