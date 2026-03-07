package JavaDaily;

import java.util.*;

public class TwoSumPair {
    public static void main(String[] args) {

       int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(getPairs(arr));
    }

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> li2 = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j]  &&  arr[i]+arr[j] ==0){
                   ArrayList<Integer> li = new ArrayList<>();
                   li.add(arr[i] );
                   li.add(arr[j]);
                   li2.add(li);
                }
            }

        }


        return li2;

    }

    public static void pr(){
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        ArrayList<Integer> le = new ArrayList<>();
        le.add(1);
        li.add(3);

        ArrayList<ArrayList<Integer>> li2 = new ArrayList<>();
        li2.add(li);
        li2.add(le);


        System.out.println(li2);
    }
}
