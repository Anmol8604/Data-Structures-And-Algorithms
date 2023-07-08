package Hashing;

import java.util.*;

class Hash{
    int Bucket;
    ArrayList<LinkedList<Integer>> table;

    Hash(int b){
        Bucket = b;
        table = new ArrayList<LinkedList<Integer>>();

        for(int i = 0; i < b; i++)
        {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(Integer key)
    {
        int i = key % Bucket;
        table.get(i).add(key);
    }

    boolean search(Integer key)
    {
        int i = key % Bucket;
        return table.get(i).contains(key);
    }
    
    void delete(Integer key)
    {
        int i = key % Bucket;
        table.get(i).remove(key);
    }   
}

class Main{
    public static void main(String[] args) {
        Hash mh = new Hash(7);
        mh.insert(48);
        mh.insert(42);
        mh.insert(50);
        mh.insert(55);
        mh.insert(53);
        System.out.println(mh.search(50));
        mh.delete(42);
        System.out.println(mh.search(42));
    }
}