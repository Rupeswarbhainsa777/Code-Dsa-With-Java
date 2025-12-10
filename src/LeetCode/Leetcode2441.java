//package LeetCode;
//
//public class Leetcode2441 {
//    class Solution {
//        public int findMaxK(int[] nums) {
//            HashSet<Integer> set = new HashSet<>();
//            int max =-1;
//            for(int el :nums){
//                if(Math.abs(el)>max){
//                    if(set.contains(-el)){
//                        max=Math.abs(el);
//                    }
//                    else{
//                        set.add(el);
//                    }
//                }
//            }
//            return max;
//
//        }
//    }
//}
