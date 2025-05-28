package lab.class8;

public class ContinueState {
    public static void main(String[] args) {
        for (int i = 41; i <= 50; i++) {
            if (i == 45) {
                continue; 
            }
            System.out.print(i+" ");
        }
    }
}


