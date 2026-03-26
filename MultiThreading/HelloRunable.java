public class HelloRunable implements Runnable {
    public void run(){
        System.out.println("I am from a thread.");
    }

    public static void main(String args[]){
        (new Thread(new HelloRunable())).start();
    }
}
