package Greedy;

public class Intro {
    public static void main(String[] args) {
        // Greedy Algorithms are mainly used for optimizing problems.
        // What is an optimizing problems ?
        // Optimizing problems are maximizing or minimizing something. e.g-> Shortest path(In this problem we are finding minimum distance path or minimum weight path.), Longest path
        // Example :
        int[] coins = {10, 5, 2, 1};
        int amount = 52;
        // Task : Minimum no. of coins are required for certain amount.
        int requiredCoin = minimumNo_of_Coins(coins, amount);
        System.out.println("Minimum no. of coins : " + requiredCoin); // 6 (5 coins of rupees 10, 1 coin of rupees 2)
    }

    static int minimumNo_of_Coins(int[] coins, int amount) {
        int coin = 0;
        for(int i = 0; i < coins.length; i++) {
            if(amount >= coins[i]){
                int c = amount/coins[i];
                coin += c;
                amount -= (coins[i]*c);
            }
        }
        return coin;
    }
}