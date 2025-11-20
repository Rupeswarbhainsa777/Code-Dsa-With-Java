package Code_75;

public class PivotIndex {

    public static void main(String[] args) {


        int nums[] = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));

    }
    public static int pivotIndex(int[] nums) {

        int n = nums.length;

        int pre[]= new int[n];
        int sum = nums[0];
        pre[0]=0;


        for(int i=1;i<n;i++){
            sum = sum+nums[i];
            pre[i]= pre[i-1]+nums[i-1];
            System.out.println(pre[i]);

        }

        for(int i=0;i<n;i++){


            if(pre[i]==sum-nums[i]-pre[i]){
                return i;
            }
        }
        return -1;
    }
}
