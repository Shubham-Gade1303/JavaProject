package Sep2026.BasicLogic;

public class revString{
    public static void main(String[] args){
        String s = "string";
        String rev = "";

        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            rev = rev + ch;
        }
        System.out.print(rev);
    }
}