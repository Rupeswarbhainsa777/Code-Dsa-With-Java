package Code_75;

public class MaxAverageSubarrayCalculator {
    public static void main(String[] args) {
       int arr[] = {1,12,-5,-6,50,3};
       int k =4;
       for (int x : arr){
           System.out.println(x+" ");
       }


        System.out.println(maxAvg(arr,k));
    }
    public static double maxAvg(int nums[],int k){

        double avg =0.0;
        double ans =0.0;

        int sum =0;

        for(int i=0;i<k;i++){
            sum = sum+nums[i];
        }
        avg = (sum*1.0)/k;
        ans =avg;

        for(int i=k;i<nums.length;i++){

            sum = sum+nums[i]-nums[i-k];
            avg = (sum*1.0)/k;

            ans = Math.max(avg,ans);

        }

        return ans;

    }
}
