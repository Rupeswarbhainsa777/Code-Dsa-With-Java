package Leetcode_150;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {


//        System.out.println(Math.abs(-5));

        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
         int value=0;
        for(int i=0;i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                   value = i-j;
                }
            }

        }

        if(Math.abs(value)<=k){
            return true;
        }
        return false;
    }
    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else {
                int prevalue = map.get(nums[i]);

               if( Math.abs(prevalue-i)<=k){
                   return true;
               }
               else {
                   map.put(nums[i],i);
               }
            }
        }
        return false;
    }
}
