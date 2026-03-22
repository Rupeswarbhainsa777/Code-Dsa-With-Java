package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        rotateAnArray(arr,k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void rotateAnArray(int arr[],int k){
        k=k%arr.length;
        reverse(arr,0,arr.length-1);

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }




    public static int [] reverse(int arr[],int left,int right){



        while (left<right){
            arr[left] =arr[left]^arr[right];
            arr[right] =arr[left]^arr[right];
            arr[left] =arr[left]^arr[right];
            left++;
            right--;
        }
        return arr;

    }
}
