package StreamAPI;
@FunctionalInterface
interface A{
    int add(int i,int j);
}
public class newApp {
    public static void main(String[] args){
        A obj =(i,j)->i+j;
        int result  = obj.add(5,10);
        System.out.println(result);
    }
}
