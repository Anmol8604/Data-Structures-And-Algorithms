package DynamicProgramming;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "anmol";
        String s2 = "value";
        int[][] arr = new int[s1.length()+1][s2.length()+1];
        int[][] brr = new int[s1.length()+1][s2.length()+1];
        for(int[] i : arr) {
            Arrays.fill(i, -1);
        }
        int res = lcs(s1, s2, s1.length(), s2.length());
        int dpRes = dpLCS(s1, s2, s1.length(), s2.length(), arr);
        int tabuRes = tabuLCS(s1, s2, s1.length()+1, s2.length()+1, brr);
        System.out.println(res + "\t" + dpRes + "\t" + tabuRes);

    }

    private static int tabuLCS(String s1, String s2, int l1, int l2, int[][] brr) {
        for(int i = 1; i < l1; i++) {
            for(int j = 1; j < l2; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    brr[i][j] = 1 + brr[i-1][j-1];
                }
                else{
                    brr[i][j] = Math.max(brr[i-1][j], brr[i][j-1]);
                }
            }
        }
        return brr[l1-1][l2-1];
    }

    private static int lcs(String s1, String s2, int l1, int l2) {
        if(l1 ==0 || l2 == 0){
            return 0;
        }
        else if(s1.charAt(l1-1) == s2.charAt(l2-1)){
            return 1 + lcs(s1, s2, l1-1, l2-1);
        }else{
            return Math.max(lcs(s1, s2, l1-1, l2),
                            lcs(s1, s2, l1, l2-1)
            );
        }
    }

    private static int dpLCS(String s1, String s2, int l1, int l2, int[] @NotNull [] memo){
        if(memo[l1][l2] != -1){
            return memo[l1][l2];
        }
        if(l1 ==0 || l2 == 0){
            return 0;
        }
        else{
            if(s1.charAt(l1-1) == s2.charAt(l2-1)){
                memo[l1][l2] = 1 + dpLCS(s1, s2, l1-1, l2-1, memo);
            }else{
                memo[l1][l2] = Math.max(dpLCS(s1, s2, l1-1, l2, memo),
                        dpLCS(s1, s2, l1, l2-1, memo)
                );
            }
        }
        return memo[l1][l2];
    }
}
