//package Leetcode_150;
//
//class MajorityElemement {
//    public int majorityElement(int[] nums) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//
//        int len = nums.length / 2;
//
//        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
//            if (ent.getValue() > len) {
//                return ent.getKey(); // return the element
//            }
//        }
//
//        return -1; // this line will never be reached as majority always exists
//    }
//}
