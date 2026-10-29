package Nov2026.Infosys;

import java.util.Scanner;

public class ACodepalindromic {
    public boolean isPalindromic(String s){


        StringBuilder binary = new StringBuilder();
        for(char c : s.toCharArray()){
          String b = Integer.toBinaryString(c);

            for(int i = b.length();i<8;i++){
                binary.append('0');

            }
            binary.append(b);


            int left =0;
            int right = binary.length()-1;

            while(left < right){
                if(binary.charAt(left) != binary.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }


        }
         return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();



        ACodepalindromic obj = new ACodepalindromic();

        boolean result = obj.isPalindromic(s);

        System.out.print(result);

    }
}
