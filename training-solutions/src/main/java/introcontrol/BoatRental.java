package introcontrol;

import java.util.Scanner;

public class BoatRental {
	public static void main(String[] args) {
		System.out.println("Kérlek írd be a csapat létszámát: ");
		Scanner scanner = new Scanner(System.in);
		int passengers = scanner.nextInt();

//		if (passengers >= 10) {
//			System.out.println("Az összes csónak kiadva!");
//			System.out.println((passengers-10) + " utas maradt a parton");
//		}

		int freePlaces = 10;
		int freeBoats = 3;

		if (passengers > 3) {
			System.out.println("5-ös csónak kiadva");
			passengers = passengers - 5;
			freeBoats--;
			freePlaces = freePlaces - 5;
		}
		if (passengers > 2) {
			System.out.println("3-as csónak kiadva");
			passengers = passengers - 3;
			freeBoats--;
			freePlaces = freePlaces - 3;
		}
		if (passengers > 0) {
			System.out.println("2-es csónak kiadva");
			passengers = passengers - 2;
			freeBoats--;
			freePlaces = freePlaces - 2;
		}
		if (passengers > 0) {
			System.out.println("Az összes csónak kiadva.");
			System.out.println(passengers + " ember maradt még a parton");
		} else {
			System.out.println("Üres helyek száma: " + freePlaces);
			System.out.println("Üres csónakok száma: " + freeBoats);
		}
	}
}
