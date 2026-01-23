package Java_Normal_Coding_Problem;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "aab";

        System.out.println(isTrue(s1, s2)); // true
    }

    public static boolean isTrue(String s1, String s2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count characters of s1
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // Count characters of s2
        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

//        for(Map.Entry<Character,Integer> ent : map1.entrySet()){
//            if(ent.getValue().equals(map2.containsValue(ent.getValue()))){
//                if(ent.getKey().equals(map2.))
//            }
//        }

        // Compare counts
        for (char ch : map1.keySet()) {
            if (map2.getOrDefault(ch, 0) < map1.get(ch)) {
                System.out.println(map2.getOrDefault(ch, 0)+ " " + map1.get(ch));
                return false;
            }
        }

        return true;
    }
}
