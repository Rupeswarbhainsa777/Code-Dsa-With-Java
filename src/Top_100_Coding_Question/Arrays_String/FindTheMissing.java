package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;

public class FindTheMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(findTheMissing(arr));
    }
    public static int findTheMissing(int arr[]){
        int curr =0;
        for(int i=0;i<arr.length;i++){
            curr =  curr+arr[i];
        }
//        System.out.println(curr);
        int expacted =(arr.length+1)*(arr.length+2)/2;
//        System.out.println(expacted);
        int acutual = expacted-curr;






        return acutual;
    }
}
