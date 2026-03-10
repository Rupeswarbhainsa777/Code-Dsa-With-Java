package JavaDaily;


import java.util.*;


class Test {
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,5,7};

        System.out.println(summaryRanges(arr));


    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> li = new ArrayList<>();


        for(int i=0;i<nums.length-1;i++){

            int first=nums[i];
            if(nums[i]+1==nums[i+1]){
                continue;
            }
            else {
                li.add(nums[i]+"->"+nums[i++]);
            }

        }
        return li;

    }


}
