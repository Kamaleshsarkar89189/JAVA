package lab.class4;

public class Ferhenite_to_celcius {
    public static void main(String[]args){
        double F=110;
        double C= (F-32)*5/9;
        String formate=String.format("%.2f",C);
        System.out.printf("Celcius:"+formate+"°c");
    
}
}