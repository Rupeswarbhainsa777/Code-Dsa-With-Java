package Leetcode_150;

import java.util.Scanner;

public class Code_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProfit(arr));


    }
    public static int maxProfit(int arr[]){
        int max =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                max +=arr[i]-arr[i-1];
            }
        }
        return max;
    }
}
