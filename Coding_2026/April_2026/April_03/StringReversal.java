package Coding_2026.April_2026.April_03;
public class StringReversal{
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("java");

        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
