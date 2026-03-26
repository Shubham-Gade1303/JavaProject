import java.util.function.*;
import java.util.stream.Stream;
import java.util.List;
import java.util.*;
public class StreamDemo {
    public static void main(String []rags){

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        Stream<Integer> con = num.stream();
        Stream<Integer> con2 = con.filter(n -> n%2 ==0);
        Stream<Integer> con3 = con2.map(n -> n*2);
        int result = con3.reduce(0,(c,e)-> c+e);

    System.out.println(result);

    }
}
