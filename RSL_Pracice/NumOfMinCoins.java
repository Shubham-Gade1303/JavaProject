package RSL_Pracice;
import java.text.NumberFormat.Style;
import java.util.*;
public class NumOfMinCoins {
    public static int[] getCoin(int amt){

        if(amt<2) return new int[]{0,0};
        int f = amt/5;
        int r = amt&5;
        int t = r/2;
        int reamin = r%2;

        if(reamin!=0){
            return new int[] {-1};
        }
        return new int[]{f,t};
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a[]  = getCoin(30);
        if(a[0]==-1){
            System.out.println("Can't get 5 or 2 coins");
        }else{
            System.out.println("5's:"+a[0]+" 2's:"+ a[1]);
        }

    }
}
