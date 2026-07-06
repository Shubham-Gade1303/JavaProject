package July2026;

import java.util.Scanner;

public class ComapreTwoString {
    public static void main(String[] args) {
      String[] s1 = {"ab", "c"};
      String[] s2 = {"a", "bc"};

      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2 = new StringBuilder();

      for(String str : s1){
        sb1.append(str);
      }
      for(String str : s2){
        sb2.append(str);
      }

      if(sb1.toString().equals(sb2.toString())){
        System.out.println("True");
      }else{
        System.out.println("False");
      }




    }
}
