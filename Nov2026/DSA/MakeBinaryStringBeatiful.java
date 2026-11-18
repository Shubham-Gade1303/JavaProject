package Nov2026.DSA;

public class MakeBinaryStringBeatiful {
    public int makeChange(String s){
        int count =0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String s = "1001";

        MakeBinaryStringBeatiful obj  = new MakeBinaryStringBeatiful();
        int result = obj.makeChange(s);
        System.out.print(result);

    }
}
