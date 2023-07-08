package Hashing;

import java.util.HashSet;

class Union{
    public static void main(String[] args) {
        int a[] = {12, 34, 45, 123};
        int b[] = {34, 13, 45, 242};

        System.out.println(Count_union(a, b));
    }

    static int Count_union(int a[], int b[])
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i : a) s.add(i);
        for(int i : b) s.add(i);
        return s.size(); 
    }
}