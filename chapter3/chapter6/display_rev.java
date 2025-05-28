package chapter6;

public class display_rev {
    public static void main(String[]args){
    int[]marks={100,84,90,75,60}; 
    for(int i=marks.length-1;i>=0;i--)  {    
    System.out.println(marks[i]);
    }
}
}