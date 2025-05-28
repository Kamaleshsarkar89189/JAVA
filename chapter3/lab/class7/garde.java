package lab.class7;

public class garde {
    public static void main(String[]args){
        int physics=80;
        int chemistry=75;
        int biology=60;
        int mathematics=90;
        double avg=(physics+chemistry+biology+mathematics)*0.25;
        if(avg>=90)
        { System.out.println("Grade:A");
        }else if(avg>=80)
        {
         System.out.println("Grade:B");
        }
         else if(avg>=70)
       {
        System.out.println("Grade:C");
       }
        else if(avg>=60)
       {
        System.out.println("Grade:D");
       }
    
}
}
