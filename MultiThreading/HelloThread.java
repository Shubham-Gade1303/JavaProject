public class HelloThread  extends  Thread{
    public void show(){
        System.out.println("I am from a thread.....");
    }

    public static void main(String args[]){
        (new HelloThread()).start();
    }
}
