package July2026;

import java.util.Arrays;

public class RevLeectcode {
    public static void RevApp(char[] s){
        int left =0;
        int right=s.length-1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
                }
    }
    

    public static void main(String[] args) {
        char[]  s = {'h','e','l','l','o'};

        RevApp(s);
        System.out.println(Arrays.toString(s));

    }
}
