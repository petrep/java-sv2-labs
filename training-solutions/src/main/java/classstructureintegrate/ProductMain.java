package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {


	Scanner scanner = new Scanner(System.in);

	System.out.println("Kérlek add meg a termék nevét:");
	String productName = scanner.nextLine();
	System.out.println("Most pedig kérlek add meg a termék árát:");
	int productPrice = scanner.nextInt();
	scanner.nextLine();
	Product myProduct = new Product(productName, productPrice);

	System.out.println(myProduct.getName() + " " + myProduct.getPrice());

	myProduct.increasePrice(300);
	System.out.println(myProduct.getName() + " " + myProduct.getPrice());

	myProduct.decreasePrice(100);
	System.out.println(myProduct.getName() + " " + myProduct.getPrice());
	}
}
