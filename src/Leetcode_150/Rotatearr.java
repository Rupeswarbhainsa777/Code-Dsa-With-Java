//package Leetcode_150;
//
//public class Rotatearr {
//
//    public static void main(String[] args) {
//
//    }
//    public void rotate(int[] nums, int k) {
//        int n=nums.length;
//
//        k=k%n;
//        swap(nums, 0, n - 1);
//        swap(nums, 0, k - 1);
//        swap(nums, k, n - 1);
//
//
//
//    }
//    private void swap(int nums[],int st,int end){
//
//        while(st<end){
//            int temp = nums[st];
//            nums[st]=nums[end];
//            nums[end]=temp;
//            st++;
//            end--;
//        }
//
//    }
//}
