package Leetcode_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutive {
    public static void main(String[] args) {
       int arr[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println( longestConsecutive(arr));

    }
    public static int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLen =1;
        int len=1;
        int prv = nums[0];
        for (int i=1;i<nums.length;i++){

            if(nums[i]==prv){
                continue;
            }
            if (nums[i]==(prv+1)){
                len++;
            }
            else {
                len=1;
            }
            prv=nums[i];

        maxLen =  Math.max(maxLen,len);
        }
        return maxLen;
    }

}
