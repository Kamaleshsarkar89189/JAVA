package lab.class12;


    

 class Dameon_Thread implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Dameon_Thread t1=new Dameon_Thread ();
        Thread t = new Thread(t1);
        t.start(); 
    }
}
