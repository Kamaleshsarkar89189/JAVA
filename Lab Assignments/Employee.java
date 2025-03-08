// Ram is an employee as a programmer. He is getting salary Rs 50000 and get bonus 10000. show the output salary and bonus using inheritance.

public class Employee {

    float salary = 50000;
}
class programmer extends Employee{
    int bonus = 10000;
    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("Programmer salary is :"+p.salary);
        System.out.println("bonus of programmer is: "+p.bonus);
    }
}