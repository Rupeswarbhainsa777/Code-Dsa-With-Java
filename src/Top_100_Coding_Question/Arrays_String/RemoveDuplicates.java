package Top_100_Coding_Question.Arrays_String;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//          removeDuplicates(arr);e

        removeDuplicates2(arr);
    }

    //Normal Approach
    public static void removeDuplicates(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }

        }
        if(arr[arr.length-2]!=arr[arr.length-1]){
            System.out.print(arr[arr.length-1]);
        }

    }

    // Using Set
    public static void removeDuplicates2(int arr[]){

        Set<Integer> li = new HashSet<>();

        for(int num : arr){
            li.add(num);
        }
        for(int out : li){
            System.out.print(out+" ");
        }
    }
}
