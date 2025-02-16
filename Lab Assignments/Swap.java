// WAP to swap between two variables (Use third variable)

public class Swap {
    public static void main(String[] args) {
        int a = 38;
        int b = 56;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swaping using third variable : a = "+a+",b = " +b);

        // Without third variable

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swaping without using third variable: a = "+a+",b = "+b);
    }
}




