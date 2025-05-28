package chapter7;

public class varags {
  public static int sum(int...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
    System.out.println("Sum is :"+sum(1,2,3,4,5));
}
}