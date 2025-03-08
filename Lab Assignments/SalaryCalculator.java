// Ram is getting basic salary INR 10000/months and he gets 5% DA and 10% HRA with INR 3000 bonus for 6 months Calculate yearly salary


public class SalaryCalculator {
    public static void main(String[] args) {
        
        double basicSalary = 10000;
        double daPercentage = 5;
        double hraPercentage = 10;
        double bonus = 3000;
        int monthsInYear = 12;
        int bonusMonths = 6;

       
        double da = (daPercentage / 100) * basicSalary;
        double hra = (hraPercentage / 100) * basicSalary;

     
        double monthlySalary = basicSalary + da + hra;

       
        double yearlySalary = monthlySalary * monthsInYear;

       
        yearlySalary += (bonus * bonusMonths);

     
        System.out.println("Total Yearly Salary: " + yearlySalary);
    }
}
