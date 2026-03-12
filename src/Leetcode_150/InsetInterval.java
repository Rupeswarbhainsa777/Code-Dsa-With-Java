package Leetcode_150;

import java.util.ArrayList;

public class InsetInterval {
    public static void main(String[] args) {



    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int []> li = new ArrayList<>();

        int idx =0;
        int n = intervals.length;
        // add prev value
        while (idx<n && intervals[idx][1]<newInterval[0]){
            li.add(intervals[idx]);
            idx++;

        }
        // add mid
        while (idx<n && newInterval[1] >=intervals[idx][0]){
            newInterval[0] = Math.min(intervals[idx][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[idx][1],newInterval[1]);
            idx++;
        }
        li.add(newInterval);
        // if any think remain

        while (idx<n){
            li.add(intervals[idx]);
            idx++;
        }

        return li.toArray(new int[li.size()][]);
    }
}
















// for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 5; j++) {
//
//arr[i][j] = (int) (Math.random() * 100);
//        }
//        }
//
//
////        System.out.println(arr[0].length + " " + arr[1].length);
//
////                {{1,2,3},{4,5,6},{7,8,9}};
//
////        for(int i=0;i<3;i++) {
////            for (int j = 0; j <5; j++)
////                System.out.println(arr[i][j]);
////        }
////        }
////        System.out.println(arr[0][1]);
////        System.out.println(arr[0][2]);
////        System.out.println(arr[1][0]);
//
//        for(int ar[] :arr){
//        for (int a :ar){
//        System.out.print(a+" ");
//            }
//                    System.out.println();
//        }
//
//
//                }
