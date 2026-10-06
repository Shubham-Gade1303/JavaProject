package Sep2026.DSA.LinearSearch;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "shubham";
        String rev = "";
        String org = s; 

        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(rev.equals(org) ){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
