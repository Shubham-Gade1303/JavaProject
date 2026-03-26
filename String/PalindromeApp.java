public class PalindromeApp {
    public static void main(String[] arsg){
        String s = "madam";
        String rev = "";

        char ch[] = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + ch[i];

        }
        
            if(s.equals(rev)){
                System.out.println("String is palindrome...");
            }else{
                System.out.println("String is not palindrome...");
            }
    }
}
