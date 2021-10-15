package classstructureattributes;

import java.util.Scanner;

public class Music {
	public static void main(String[] args) {
		Song mySong = new Song();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kérlek add meg a dal előadóját:");
		String myBand = scanner.nextLine();
		System.out.println("Most pedig kérlek add meg a dal címét:");
		String myTitle = scanner.nextLine();
		System.out.println("Végül pedig kérlek add meg a dal hosszát:");
		int myLength = scanner.nextInt();
		scanner.nextLine();

		mySong.band = myBand;
		mySong.title = myTitle;
		mySong.length = myLength;

		System.out.println(" Ezeket az adatokat adtad meg: ");
		System.out.println(mySong.band + " - " + mySong.title +
			" (" + mySong.length + " perc)");
	}
}
