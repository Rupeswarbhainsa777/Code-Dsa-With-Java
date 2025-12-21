package Leetcode_150;

import java.util.Set;
import java.util.TreeSet;

public class Testing {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,1,5,5,9};

        Set<Integer> set = new TreeSet<>();

        for(int i : arr){
            set.add(i);
        }
        for(int ix : set){
            System.out.println(ix);
        }

    }
}
