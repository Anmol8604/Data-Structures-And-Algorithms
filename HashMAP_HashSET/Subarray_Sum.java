package Hashing;

import java.util.HashSet;

class Subaaray_Sum{
    public static void main(String[] args) {
        int arr[] = {5, 8, 6};
        int sum = 19;

        System.out.println(sum_(arr, sum));
    }

    static boolean sum_(int arr[], int sum){
        HashSet<Integer> s = new HashSet<>();
        int prefix = 0;
        for(int i : arr)
        {
            s.add(prefix);
            prefix += i;
            if(s.contains(prefix - sum)) return true;
        }
        return false;
    }
}