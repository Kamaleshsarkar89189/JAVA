package chapter6;

public class _3darray {
    public static void main(String[]args){
    int[][][] threeDArray = {
        {
            {1, 2, 3}, 
            {5, 6, 7}, 
            {9, 10, 11}
        }, 
        {
            {13, 14, 15}, 
            {17, 18, 19}, 
            {21, 22, 23}
        }
    };
    System.out.println(threeDArray[1][2][2]);   
}
}