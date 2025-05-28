package lab.class9;
  public class sum_of_digits {
    public static void main(String[] args) {
        int number = 12345; 
        int sum = 0;
        for (int n = number; n > 0; n /= 10) {
            sum += n % 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
