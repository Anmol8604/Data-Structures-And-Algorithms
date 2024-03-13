package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 3};
        int total = 10;
        System.out.println(tabuCoinChange(total, arr));
    }

    public static int tabuCoinChange(int total, int[] arr){
        int[] dp = new int[total+1];
        if(total == 0) return 0;
        dp[0] = 1;
        for(int n : arr) {
            for(int i = n; i <= total; i++){
                dp[i] += dp[i-n];
            }
        }
        return dp[total];
    }
}
