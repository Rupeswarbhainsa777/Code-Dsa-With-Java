

package Code_75;
import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int k=5;
        System.out.println(maxOperations(arr,k));

    }

    public static int maxOperations(int[] nums, int k) {

        int ans =0;

        Arrays.sort(nums);

        int li=0;
        int ri=nums.length-1;


        while(li<ri){


            if(nums[li]+nums[ri]<k){
                li++;
            }
            else if(nums[li]+nums[ri]>k){
                ri--;
            }
            else{
                li++;
                ri--;
                ans++;
            }

        }
        return ans;
    }
}
