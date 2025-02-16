// WAP in java to findout the simple interest of principle is INR 50000, time is 5 year and rate of interest is 5%.


public class Simple_Interest {
    public static void main(String[] args) {
        int principle = 50000;
        double rate = 5;
        double time = 5;

        double interest = (principle*time*rate)/100;

        System.out.println("The simple interest is : "+interest);


    }
}
