package Sep2026.DSA;

import java.util.*;
public class FavouriteSinger{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Long, Long> fre = new HashMap<>();

        for(int i=0;i<n;i++){
            long singer = sc.nextLong();

            fre.put(singer,fre.getOrDefault(singer, 0L) +1);

        }


        long maxfre = 0;

        for(long count : fre.values()){
            if(count > maxfre){
                maxfre = count;
            }
        }


        long favsong = 0;
        for(long count : fre.values()){
            if(count == maxfre){
                favsong++;
            }
        }

        System.out.println(favsong);
        sc.close();
    }
}