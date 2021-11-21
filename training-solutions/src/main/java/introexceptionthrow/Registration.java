package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean validRegistration = true;

        System.out.println("X Registration Page");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            validRegistration = false;
            System.out.println(iae.getMessage());
        }

        System.out.println("Please enter how old you are:");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        } catch (IllegalArgumentException iae) {
            validRegistration = false;
            System.out.println(iae.getMessage());
        }

        System.out.println();

        System.out.println("Registration data: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println();

        if (validRegistration) {
            System.out.println("Registration was a success!");
        } else {
            System.out.println("Registration failed!");
        }
    }
}
