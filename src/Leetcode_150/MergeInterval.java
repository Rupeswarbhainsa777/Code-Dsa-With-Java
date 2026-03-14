package Leetcode_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{4,6},{8,10},{15,18}};

        int n = intervals.length;

        Arrays.sort(intervals[0]);
        Arrays.sort(intervals[1]);

//        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }



    }
//    public static int[][] merge(int[][] intervals) {
//
//
//
//
//    }
}
