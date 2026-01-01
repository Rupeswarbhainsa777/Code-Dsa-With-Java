package Java_Normal_Coding_Problem;

public class ProductOfItSelf {

    public static void main(String[] args) {
        int arr[] =new  int[]{1, 2 ,6 ,4};
        System.out.println( productExceptSelf(arr));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[] = new int[n];
        arr[0] = 1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int suf=1;
        for(int j=n-1;j>=0;j--){
            arr[j]=arr[j]*suf;
            suf=suf*nums[j];
        }
        return arr;
    }
}
