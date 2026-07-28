package July2026.StramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import June_2026.countVowel;

public class FreqOfEachElement {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java", "Python", "Java", "Spring","Python");

        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
