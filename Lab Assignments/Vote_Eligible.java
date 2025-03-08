// Write a java program to check whethee a person is eligible for vote in india.

public class Vote_Eligible {
    public static void main(String[] args) {
        String name = "Kamalesh Sarkar";
        int age = 18;

        if (age>=18) {
            System.out.println("You are eligible for vote: "+name);
        }else{
            System.out.println("You are not eligible for vote."+name+ "! Age must be above 18 year.");
        }
    };
}
