package Hashing;

import java.util.HashSet;

class SubarraySum_0{
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, -3, -10, 5};

        System.out.println(prefix(arr));
    }

    static boolean prefix(int arr[]) {
        int sum = 0;
        HashSet <Integer> s = new HashSet<>();
        for(int i : arr)
        {
            s.add(sum);
            sum += i;
            if(s.contains(sum)) return true;
        }
        return false;
    }
}