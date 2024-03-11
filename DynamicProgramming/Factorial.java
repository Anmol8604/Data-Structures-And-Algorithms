package DynamicProgramming;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        int res = fact(6);
        System.out.println(res);
        int ans = factTabu(8);
        System.out.println(ans);
    }

    private static int factTabu(int n) {
        int[] tabu = new int[n+1];
        tabu[0] = 0;
        tabu[1] = 1;
        for (int i = 2; i <= n; i++) {
            tabu[i] = tabu[i-1] + tabu[i-2];
        }
        return tabu[n];
    }

    private static int fact(int i) {
        int[] memo = new int[i+1];
        Arrays.fill(memo, -1);

        return memoFactorial(i, memo);
    }

    private static int memoFactorial(int i, int[] memo) {
        if(memo[i] == -1) {
            int res;
            if(i == 0 || i == 1) {
                res = i;
            }
            else{
                res = memoFactorial(i-1, memo) + memoFactorial(i-2, memo);
            }
            memo[i] = res;
        }
        return memo[i];
    }
}
