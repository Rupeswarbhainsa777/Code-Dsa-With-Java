package Top_100_Coding_Question.Arrays_String;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[] = new int[n];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        mergeTwoSortedArrays(arr1,arr2);

    }
    public static void mergeTwoSortedArrays(int arr1[],int arr2[]){
        int merge[] = new int[arr1.length+arr2.length];


        int idx =0;

        for(int i=0;i<arr1.length;i++){
            merge[idx++] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merge[idx++] = arr2[i];
        }
          // If you want to print sorted order
        Arrays.sort(merge);

        for(int element : merge){
            System.out.print(element+" ");
        }
    }
}
