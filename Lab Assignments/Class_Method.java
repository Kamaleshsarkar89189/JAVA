class BaseClass
{
    void display()
    {
        System.out.println("BaseClass: Display with : default");
    }
}


public class Class_Method {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        obj.display();
    }
}
