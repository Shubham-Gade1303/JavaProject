import java.util.*;

class Processor extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void shutDown() {
        running = false;
    }
}

public class Shubh {
    public static void main(String args[]) {

        Processor psr1 = new Processor();
        psr1.start();

        System.out.println("Press Enter to stop...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        psr1.shutDown();
        sc.close();
    }
}
