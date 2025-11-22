package Java_Normal_Coding_Problem;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();


        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        int ar[] = twoSum(arr,k);
                for(int i=0;i<ar.length;i++){
                    System.out.println(ar[i]);
                }
    }

    public static int[] twoSum(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};


    }
}
