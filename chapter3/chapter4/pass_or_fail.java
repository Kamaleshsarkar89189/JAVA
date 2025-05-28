package chapter4;
import java.util.Scanner; 

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter Physics's number: ");
        int a = sc.nextInt();
        System.out.print("Enter Chemistry's number: ");
        int b = sc.nextInt();
        System.out.print("Enter Mathematic's number: ");
        int c = sc.nextInt();
       float total_prcentage=(a+b+c)/3;
    if(total_prcentage>=40&& a>=33&&b>=33&&c>=33){
        System.out.println("Congratulation! You are pass.");
 }else{
        System.out.println("You are fail.");
    }
    sc.close(); 
}
}