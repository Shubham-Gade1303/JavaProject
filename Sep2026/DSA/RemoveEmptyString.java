package Sep2026.DSA;

import java.util.Arrays;

public class RemoveEmptyString{

    public static void main(String[] args) {
        String[] str = {"Java", "", "Stream","", "cool", "is"};

     String[] arr =  Arrays.stream(str).
         filter(s -> !s.isEmpty())
                    .toArray(String[]::new );

                    System.out.println(Arrays.toString(arr));

    }
}