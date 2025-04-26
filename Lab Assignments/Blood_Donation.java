// WAP to show if age is greater than 18 and weight is greater than 50, then the person is eligible to donate blood. Otherwise, the person is not eligible.

public class Blood_Donation {
    public static void main(String[] args) {

        int age = 21;
        int weight = 60;

        if (age >= 18 && weight>= 50){
            System.out.println("You are eligible for donate blood");
        }else{
            System.out.println("You are not eligible for donate blood");
        }
    }
}
