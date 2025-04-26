// WAP to print string variable with if statement.

import java.util.Scanner;

public class StringWithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            System.out.println("You entered: " + input);
        } else {
            System.out.println("String is empty.");
        }

        scanner.close();
    }
}
