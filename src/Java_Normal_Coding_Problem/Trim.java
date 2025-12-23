package Java_Normal_Coding_Problem;

import java.util.Arrays;

public class Trim {

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,7,36,3,547};

        rearannge(arr);
    }

    public static void rearannge(int arr[]){

        Arrays.sort(arr);

        for(int x : arr) {
            System.out.println(x);
        }
    }
}
