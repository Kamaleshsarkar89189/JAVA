package chapter7;

public class method_overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(int a,float b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
         System.out.println("Sum is="+sum(2,3));
         System.out.println("Sum is="+sum(2,2.5f));
         System.out.println("Sum is="+sum(2,3,4));
     }
}
