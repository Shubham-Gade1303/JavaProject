package Nov2026.Infosys;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonReaptingCharacgter{
    public static char firstNonReap(String s ){
HashMap<Character, Integer> map = new HashMap<>();
for(char ch : s.toCharArray()){
    map.put(ch, map.getOrDefault(ch,0) +1);
}


for(char ch : s.toCharArray()){
    if(map.get(ch) ==1){
        return ch;
    }
}

return '0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        System.out.print(firstNonReap(s));

        
    }
}