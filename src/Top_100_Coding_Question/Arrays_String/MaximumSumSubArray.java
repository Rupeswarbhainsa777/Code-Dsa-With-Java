package Top_100_Coding_Question.Arrays_String;

import java.util.Map;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(maximumSumSubArray(arr));

    }
    //kadanes Algo
    public static int maximumSumSubArray(int arr[]){

        int max =Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
          max=  Math.max(max,sum);
          if(sum<0){
              sum=0;
          }
        }
        return max;
    }


    //Brute force Approach
//    public static int maximumSumSubArray(int arr[]){
//        int n =arr.length;
//        int max = 0;
//        for(int i=1;i<=n;i++){
//
//            for (int j=0;j<=i-n;j++){
//                int sum = 0;
//                for (int k =j;k<i+j;k++){
//                    sum=sum+arr[k];
//                }
//                max = Math.max(sum,max);
//            }
//        }
//        return max;
//    }
}
