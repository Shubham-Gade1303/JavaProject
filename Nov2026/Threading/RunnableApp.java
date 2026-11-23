package Nov2026.Threading;

class task implements Runnable{
    @Override 
    public void run(){
        System.out.println("Thread is runnning");
    }
}
public class RunnableApp {
    public static void main(String[] args) {

        task t = new task();
        Thread s = new Thread(t);

        s.start();

    }
}
