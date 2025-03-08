// WAP to findout centregate temperature if fahrenheit temperature is 110.

public class Fahrenheit_Centregate {
    public static void main(String[] args) {
        double fahrenheit = 110;
        double centrigate = (fahrenheit - 32) * 5/9;

        System.out.println("The fahrenheit temperature of " + fahrenheit + "deg is: " + centrigate);
    }
}
