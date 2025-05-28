package chapter7;

public class fibonachi {
    public static int fibo(int n){
        if(n<=1){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
    int n=2;
    System.out.println("Fibonachi of "+n+" term is:");
       for (int i = 0; i < n; i++) {
        System.out.print(fibo(i) + " ");
    }
}
   }
