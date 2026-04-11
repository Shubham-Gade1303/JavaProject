package RSL_Pracice;

public class ClosestPrimeNumber {
    static boolean isPrime(int n)
    {
        if(n<2)return false;
         if(n==2) return true;
         if(n%2==0) return false;
           
    for(int i=3;i*i<=n;i++)
        if(n%i==0) return false;

        return true;
}

    static int closeprim(int n){
        if(isPrime(n)) return n;

        int lo = n-1,hi =n+1;
        while (true) {
            if(lo> 1 && isPrime(lo)) return lo;
            if(isPrime(hi)) return hi;
            lo--;
            hi++;
            
        }
    }
        

    

    public static void main(String[] args) {
        int[] tests= {1,10,14,17,20,100};
        for(int n : tests){
            System.out.println("close prime num " + n + " " + closeprim(n));
        }
    }

}