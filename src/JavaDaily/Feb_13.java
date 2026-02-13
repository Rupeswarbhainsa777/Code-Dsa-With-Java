package JavaDaily;

import java.util.Scanner;



public class Feb_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("out put");
        lonBalance(arr);
    }

    public static  void lonBalance(int arr[]){
        int n = arr.length;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                for(int k=j;k<i+j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
