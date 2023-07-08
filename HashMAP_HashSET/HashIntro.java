package Hashing;

import java.util.HashMap;

public class HashIntro{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // INSERT operation in Hashmap
        hm.put("India", 150);
        hm.put("Austrlia", 200);
        hm.put("Newzland", 100);
        hm.put("SouthAfrica", 400);

        // Print HashMap
        System.out.println();
        System.out.println(hm);

        // Size of HashMap
        int a = hm.size();
        System.out.println(a);

        // Remove Operation in HashMap
        System.out.println(hm.remove("India"));
        System.out.println(hm.remove("Pakistan"));
        System.out.println(hm);
        System.out.println(hm.size());

        // Clear HashMap
        // hm.clear();
        System.out.println(hm.isEmpty());

        // Search HashMap
        System.out.println(hm.containsKey("SouthAfrica"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.get("gandu gopal"));
        System.out.println(hm.containsValue(200));
    }
}