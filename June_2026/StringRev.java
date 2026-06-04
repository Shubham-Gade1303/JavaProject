package June_2026;

public class StringRev {
    public static void main(String[] args) {
        String s = "java";
        // // String rev ="";
        // // for(int i=s.length()-1;i>=0;i--){
        // //     rev = rev+s.charAt(i);
        // // }
        // // System.out.print(rev);

        // // without thrird variable reverse
        
        // String rev = new StringBuilder(s).reverse().toString();
        // System.out.print(rev);

        char[] ch = s.toCharArray();
        int left =0, right = ch.length-1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right ]= temp; 
            left++;
            right--;
        }
        System.out.print(new String(ch));

    }
}
