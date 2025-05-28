package lab.class4;

public class celcius_to_ferhenite {
    public static void main(String[]args){
        double c=40;
        double F=(c*9/5)+32;
        String formate=String.format("%.2f",F);
        System.out.println("Ferhenite:"+formate+"°F");
}

    
}

