package Hashing;

import java.util.HashSet;
import java.util.Set;

class Insertion{
    public static void main(String[] args)
    {
        int a[] = {30, 15, 20, 10, 5};
        int b[] = {5, 30, 5, 80};

        System.out.println(insertion(a, b));
    }

    static int insertion(int a[] , int b[])
    {
        Set <Integer> s = new HashSet<>();
        for(int i : a) s.add(i);
        int count = 0;
        for(int i : b)
        {
            if(s.contains(i)) 
            {
                count++;
                s.remove(i);
            }
        }
        return count;
    }
}