package chapter7;

public class varags1 {
    
 public static int sum(int x,int...arr){
        int result=x;
        for(int a:arr){
            result+=a;                  //atleast 1 integer required
        }
        return result;
    }

    public static void main(String[] args) {
    System.out.println("Sum is :"+sum(1));
}
}
