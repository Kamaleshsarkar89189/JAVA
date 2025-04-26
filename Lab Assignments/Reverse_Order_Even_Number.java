// WAP to print even numbers in reverse order between 50 to 100.

public class Reverse_Order_Even_Number {
    public static void main(String[] args) {
        System.out.println("The even number between 50 to 100 in reverse order is: ");
        for(int i=100; i>=50; i--){
            if (i % 2==0) {
                System.out.println(i);
            }
        }
    }
}
