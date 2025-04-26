// WAP to print number bewteen 40 to 50 except 45

public class Range_exclude {
    public static void main(String[] args) {
        for (int i=40; i<=50; i++){
            if(i==45){
                continue;
            }
            System.out.println(i);
        }
    }
}
