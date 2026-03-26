import java.util.HashMap;
import java.util.Map;
public class MapApp {

    public static void main(String args[]){
        Map<String, Integer> student = new HashMap<>();

        student.put("shubha",1);
        student.put("sham",2);
        student.put("ram",3);
        student.put("satish",1);
        student.put("satish",10);

        System.out.println(student.keySet());

        for(String key : student.keySet()){
            System.out.println(key + " : " + student.get(key) );
        }


    }
    
}
