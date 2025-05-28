package lab.class5;

public class gross_sallary {
    public static void main(String[] args) {
        int basic = 10000;
        double hra = 0.1 * basic;
        double da = 0.05 * basic;
        double bonus=3000;
        double Monthly_gross = basic + hra + da;
        double gross = 12*Monthly_gross + 6*bonus;
        System.out.println("Gross Salary is: " + gross);
    }
}
    

