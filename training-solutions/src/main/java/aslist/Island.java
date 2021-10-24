package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {

	public static void main(String[] args) {
		Island island = new Island();
		Scanner scanner = new Scanner(System.in);
		List<String> threeMostImportantObjects = Arrays.asList("víz", "telefon", "sim kártya");

		System.out.println("Mi az a 3 dolog amit magaddal vinnél egy lakatlan szigetre?");
		System.out.println("Itt a listád: " + threeMostImportantObjects);
		System.out.println();
		System.out.println("Ha szeretnél változtatni a listán, itt a lehetőség");
		System.out.println("Kérlek add meg, hányadik elemet cseréljük le:");
		int index = scanner.nextInt() - 1;
		scanner.nextLine();
		System.out.println("Mire szeretnéd lecserélni?");
		String replacement = scanner.nextLine();
		threeMostImportantObjects.set(index, replacement);
		System.out.println("A véglegesített lista:");
		System.out.println(threeMostImportantObjects);
	}
}
