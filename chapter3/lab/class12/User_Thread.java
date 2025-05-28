package lab.class12;

public class User_Thread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        User_Thread t = new User_Thread();
        t.start(); 
    }
}
