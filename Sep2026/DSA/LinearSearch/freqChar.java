package Sep2026.DSA.LinearSearch;

public class freqChar {
    public static void main(String[] args) {
        String s = "programming";

        int[] freq = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char) i+ " : "+ freq[i]);
            }
        }
    }
}
