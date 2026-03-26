import java.util.*;
public class Demo{
    public static void main(String args[]){
        Collection<Integer> num = new TreeSet<>();

        num.add(62);
        num.add(21);
        num.add(45);
        num.add(60);
        num.add(20);

        Iterator<Integer> value = num.iterator();

        while(value.hasNext()){
            System.out.println(value.next());
        }
    }
}