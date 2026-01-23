package Leetcode_150;

import java.util.HashMap;
import java.util.Map;

public class Isomeric {
    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {

        if(s.length() !=t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch1 : s.toCharArray()){
            map1.put(ch1, map1.getOrDefault(ch1,0)+1);
        }
        for(char ch2 : t.toCharArray()){
            map2.put(ch2, map1.getOrDefault(ch2,0)+1);
        }

        for(Map.Entry<Character,Integer> ent : map1.entrySet()){
            if(map1.keySet()==map2.keySet()){
                return true;
            }
        }
        return false;

    }
}
