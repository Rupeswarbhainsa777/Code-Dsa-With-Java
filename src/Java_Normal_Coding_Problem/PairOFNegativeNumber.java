package Java_Normal_Coding_Problem;

import java.util.Scanner;

public class PairOFNegativeNumber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        printNegativeNumber(arr);
    }
    public static  void printNegativeNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<0 && arr[j]<0){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
