package Code_75;

public class SubarrayCalculator {
    public static void main(String[] args) {
        int arr[]= {1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {


        int ans =0;
        int i=0;
        int j=-1;
        int k=1;

        int count =0;
        while(i<nums.length){

            if(nums[i]==0){
                i++;
                count++;
            }
            else{
                i++;
            }

            while(count>k){
                j++;

                if(nums[j]==0){
                    count--;
                }


            }

            int win = i-1-j;

            ans = Math.max(ans,win);



        }



        return ans-1;

    }
}
