package GreedyAlgorithm;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {

    }
    public int eraseOverlapIntervals(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int count =0;
        int firstVal= arr[0][1];
        for (int i=1;i<arr.length;i++){

            if(firstVal>arr[i][0]){
                count++;

            }else {
                firstVal = arr[i][1]; // no overlap → update
            }
        }
        return count;
    }
}
