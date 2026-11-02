package Nov2026.DSA;

import java.util.Scanner;

public class HavingOneChoreWithAhelper {
    public static int MinTime(int N,  int[] a){
        int total =0;

        int max = a[0];

        for(int i=0;i<N;i++){
            total += a[i];

            if(a[i]> max){
                max = a[i];
            }
        }

        return total - max + (max /2);
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for(int i =0;i<N;i++){
            a[i] = sc.nextInt();
        }


        int result = MinTime(N, a);
        System.out.print(result);
    }
}


