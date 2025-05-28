package lab.class5;
class BaseClass
{
    void display()
    {
        System.out.println("BaseClass.display with 'default' scope");
    }
}
    class Main
{
public static void main(String[]args){
    BaseClass obj=new BaseClass();
    obj.display();
}
    
}
