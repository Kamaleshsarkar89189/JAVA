package lab.class5;
class Constructor
{
private String name;
 {
        System.out.println("Constructor Called");
        name = "Java";
    }
    public static void main(String[]args){
        Constructor obj=new Constructor();
        System.out.println("The name is "+obj.name);
    }
    
}
