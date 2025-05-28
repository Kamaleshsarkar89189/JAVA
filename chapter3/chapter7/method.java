package chapter7;

public class method {
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        method myobj=new method();
        System.out.println("Sum is="+myobj.sum(2,3));
    }
}

