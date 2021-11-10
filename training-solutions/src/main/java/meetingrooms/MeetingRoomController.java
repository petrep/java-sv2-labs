package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
	private Office office = new Office();

	public static void main(String[] args) {
		MeetingRoomController meetingRoomController = new MeetingRoomController();
		meetingRoomController.runMenu();
	}

	public void readOffice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adja meg a tárgyaló adatait: ");
		System.out.println("A tárgyaló neve:");
		String name = scanner.nextLine();
		System.out.println("Szélesség, méterben: ");
		int length = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Hosszúság, méterben: ");
		int width = scanner.nextInt();
		scanner.nextLine();
		System.out.println();

		MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
		office.addMeetingRoom(meetingRoom);
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
		scanner.nextLine();
		menuSelector(chosenMenu);
	}

	private void menuSelector(int chosenMenu) {
		Scanner scanner = new Scanner(System.in);
		switch (chosenMenu) {
			case 1:
				readOffice();
				runMenu();
				break;

			case 2:
				if (office != null) {
				office.printNames();}
				runMenu();
				break;

			case 3:
				office.printNamesReverse();
				runMenu();
				break;

			case 4:
				office.printEvenNames();
				runMenu();
				break;

			case 5:
				office.printAreas();
				runMenu();
				break;

			case 6:
				System.out.println("Adja meg a tárgyaló nevét:");
				String name = scanner.nextLine();
				office.printMeetingRoomsWithName(name);
				runMenu();
				break;

			case 7:
				System.out.println("Adja meg a szórészletet:");
				String part = scanner.nextLine();
				office.printMeetingRoomsContains(part);
				runMenu();
				break;

			case 8:
				System.out.println("Adja meg a tárgyaló területét:");
				int area = scanner.nextInt();
				scanner.nextLine();
				office.printAreasLargerThan(area);
				runMenu();
				break;

			case 9: break;
		}
	}
}
