// WAP to continue prompting the user to enter positive values until they enter negetive one
import java.util.Scanner;

public class UntilNegativeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter number: ");
            num = scanner.nextInt();
        } while (num >= 0);

        System.out.println("Program terminated");
        scanner.close();
    }
}
