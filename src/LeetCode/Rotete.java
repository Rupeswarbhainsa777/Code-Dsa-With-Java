package LeetCode;

public class Rotete {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7};

//        System.out.println();
//
//        rotate(arr,3);

        System.out.println(7%5);


    }

    public static void rotate(int[] nums, int k) {
         int n = nums.length;
         k=k%n;
        System.out.println(k);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
         }
        System.out.println();
         rev(nums,0,n-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

         rev(nums,0,k-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        rev(nums,k,n-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();



    }



    private static void rev(int arr[], int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }


}
