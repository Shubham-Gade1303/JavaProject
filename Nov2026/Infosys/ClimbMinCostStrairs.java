package Nov2026.Infosys;

import java.util.Scanner;

public class ClimbMinCostStrairs {

    public int climb(int n , int[] costs){
  
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            dp[i] = Integer.MAX_VALUE;

            for (int j = Math.max(0, i - 3); j < i; j++) {

                int jump = i - j;

                int cost = dp[j] + costs[i - 1] + jump * jump;

                dp[i] = Math.min(dp[i], cost);
            }
        }

        return dp[n];
    
}

    public static void main(String[] args) {
        int n = 4;
        int[] costs = {1,2,3,4};


        ClimbMinCostStrairs obj = new ClimbMinCostStrairs();
        int result = obj.climb(n, costs);
        System.out.print(result);
    }
}
