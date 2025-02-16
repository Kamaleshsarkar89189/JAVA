
class MyClass {
    int number;
    MyClass(int num){
     number = num;
    }
}


public class Create_Obj_Acess {
    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
        System.out.println(obj.number);

    }
}
