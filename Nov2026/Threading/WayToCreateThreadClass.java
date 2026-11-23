package Nov2026.Threading;


class myThread extends Thread{

    @Override 
    public void run(){
        System.out.println("Thread is running ");
    }
}

public class WayToCreateThreadClass {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
        
    }
}
