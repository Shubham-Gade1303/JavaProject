package Nov2026.StreamAPI;

interface  App{

    static int add(int a, int b){
        return a+b;
    }
}
public class AppStaticInterface {
    public static void main(String[] args) {
        System.out.println(App.add(10, 10));
    }
}
