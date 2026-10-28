package Oct2026.Level3Prolem;

public class ReverseBits {
    public int revereBits(int n ){

        int result = 0;


        for(int i=0;i<32;i++){
            result = result << 1;

            result = result | (n & 1);

            n = n >>>1;
        }
        return result;
    }
    


    public static void main(String[] args) {
        int n = 43261596;

        ReverseBits obj = new ReverseBits();
        int app = obj.revereBits(n);

        System.out.print(app);
    }
}
