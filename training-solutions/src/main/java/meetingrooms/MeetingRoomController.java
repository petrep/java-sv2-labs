package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
	private Office office;

	public static void main(String[] args) {
		MeetingRoomController meetingRoomController = new MeetingRoomController();
		meetingRoomController.runMenu();
	}

	public void readOffice() {

	}

	public void printMenu() {
		System.out.println("1. Tárgyaló rögzítése");
		System.out.println("2. Tárgyalók sorrendben");
		System.out.println("3. Tárgyalók visszafele sorrendben");
		System.out.println("4. Minden második tárgyaló");
		System.out.println("5. Területek");
		System.out.println("6. Keresés pontos név alapján");
		System.out.println("7. Keresés névtöredék alapján");
		System.out.println("8. Keresés terület alapján");
		System.out.println("9. Kilépés");
		System.out.println();
	}

	public void runMenu() {
		printMenu();
		System.out.println("Kérem adja meg melyik funkciót akarja futtatni!");
		Scanner scanner = new Scanner(System.in);
		int chosenMenu = scanner.nextInt();
	}
}
