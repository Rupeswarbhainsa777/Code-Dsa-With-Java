package GreedyAlgorithm;

import java.util.List;

public class MinimumPlatforms {
    public static void main(String[] args) {


    }
    public static int minPlatform(int arr[], int dep[]) {
        int n = arr.length;

        int[][] arr1 = new int[n][2]; // n rows, 2 columns

        for (int i = 0; i < n; i++) {
            arr1[i][0] = arr[i]; // start time
            arr1[i][1] = dep[i];   // end time
        }

        int count =0;
        for (int i=0;i<arr1.length;i++){

        }

    }


}
