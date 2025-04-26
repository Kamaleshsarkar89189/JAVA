// WAP to compare two string 

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Strings are equal using equals() method.");
        } else {
            System.out.println("Strings are not equal using equals() method.");
        }

        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Strings are equal using compareTo() method.");
        } else if (result > 0) {
            System.out.println("First string is greater than second string.");
        } else {
            System.out.println("First string is smaller than second string.");
        }

        scanner.close();
    }
}
