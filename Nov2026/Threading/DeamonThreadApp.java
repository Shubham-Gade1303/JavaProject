package Nov2026.Threading;
public class DeamonThreadApp{
    public static void main(String[] args) {
    

        Thread t = new Thread(() -> {
            while(true)
                System.out.println("Daemon thread running ");

        });

        t.setDaemon(true);
        t.start();
        System.out.println("Main Thread finished");
    }
}