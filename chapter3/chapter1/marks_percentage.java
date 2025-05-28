
import java.util.Scanner; 

public class marks_percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter marks of Bengali:");
        int a = sc.nextInt();
        System.out.print("Enter marks of English:");
        int b = sc.nextInt();
        System.out.print("Enter marks of Mathematics:");
        int c = sc.nextInt();
        System.out.print("Enter marks of Physics:");
        int d = sc.nextInt();
        System.out.print("Enter marks of Bengali:");
        int e = sc.nextInt();
        double percentage=(a+b+c+d+e)*0.2;
        System.out.println("Result is:"+ percentage +"%");
        sc.close(); 
    }
}
