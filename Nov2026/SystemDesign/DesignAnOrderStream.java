package Nov2026.SystemDesign;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderStream {

    String[] arr;
    int prt ;

    public DesignAnOrderStream(int n ){
        arr = new String[n];
        prt =0;
    }

    public List<String> insert(int idkey, String value){
        arr[idkey -1] = value;
        List<String> list = new ArrayList<>();
        while(prt <arr.length && arr[prt] != null){
            list.add(arr[prt]);
            prt++;
        }
        return list;
    }


    public static void main(String[] args) {

        DesignAnOrderStream os = new DesignAnOrderStream(5);

        System.out.println(os.insert(3, "ccccc"));
        System.out.println(os.insert(1, "aaaaa"));
        System.out.println(os.insert(2, "bbbbb"));
        System.out.println(os.insert(5, "eeeee"));
        System.out.println(os.insert(4, "ddddd"));
        
    }
}
