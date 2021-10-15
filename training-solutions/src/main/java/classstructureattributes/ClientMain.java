package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Client myClient = new Client();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kérlek add meg az ügyfél nevét:");
		String clientName = scanner.nextLine();
		System.out.println("Most pedig kérlek add meg az ügyfél" +
			" születési évét:");
		int clientYear = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Végül pedig kérlek add meg az ügyfél" +
			" címét:");
		String clientAddress = scanner.nextLine();

		myClient.name = clientName;
		myClient.year = clientYear;
		myClient.address = clientAddress;

		System.out.println(" Ezeket az adatokat adtad meg: ");
		System.out.println("NÉV: " + myClient.name);
		System.out.println("SZÜLETÉSI ÉV: " + myClient.year);
		System.out.println("CÍM: " + myClient.address);
	}
}
