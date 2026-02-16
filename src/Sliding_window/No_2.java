package Sliding_window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_2 {
    public static void main(String[] args) {

    }
    public static List<Integer> findFirstNeg(int arr[],int k){
        List<Integer> li = new ArrayList<>();
        Queue<Integer> q1 = new LinkedList<>();
        int idx =0;
        while(idx<k){
            if(arr[idx]<0){
                q1.offer(arr[idx]);
            }
            idx++;
        }


        li.add(q1.isEmpty()?0:q1.peek());
        for(int i=1;i<=arr.length-k;i++){

            if(arr[i-1]<0){
                q1.poll();
            }
            if(arr[i+k-1]<0){
                q1.offer(arr[i+k-1]);
            }
            li.add(q1.isEmpty()?0:q1.peek());
        }
return  li;

    }
}
