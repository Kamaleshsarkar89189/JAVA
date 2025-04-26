// WAP in Java to print 1,2,3,4 in range of 1 to 10

public class Range_of_Number {
public static void main(String[] args) {
    int number = 10;

    for (int i=0; i<=number; i++) {
        if (i==4) {
            break;
        }
        System.out.println(i+1);
    }
}
}
