package LeetCode;

import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int n = nums.length/2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> ent : map.entrySet()){
            if(ent.getValue()>n){
                return ent.getKey();
            }
        }
        return 0;

    }
}
