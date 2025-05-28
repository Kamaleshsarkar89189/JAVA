package lab.class4;

public class Employee {
    int salary=50000;
}
class programmer extends Employee {
    int bonus=10000;
    public static void main(String[]args){
        programmer p=new programmer();
       // int a=p.salary+p.bonus;
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Programmer total slarry is:"+p.bonus);
        
}  
    
}
