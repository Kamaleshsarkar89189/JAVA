package chapter6;

public class _2Darray_decl2 {
    public static void main(String[]args){
    int[][]marks=new int [2][2];          //Declearation & allocation
    //initialization
    marks[0][0]=100;
    marks[0][1]=84;
    marks[1][0]=90;
    marks[1][1]=75;
    System.out.println( marks[0][1]);
}
}