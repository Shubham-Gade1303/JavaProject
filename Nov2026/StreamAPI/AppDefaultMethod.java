package Nov2026.StreamAPI;


interface vehical{
    void start();


    default void stop(){
        System.out.println("Vehical stoped");
    }
}

class Car implements vehical{
    public  void starr(){
        System.out.println("Car started");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}
public class AppDefaultMethod {
    public static void main(String[] args){


        Car c = new Car();
        c.starr();
        c.stop();

    }
}
