package Java_Normal_Coding_Problem;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int [][] ar = new int[n][n];

        System.out.println("Enter matrix values:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix output:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void isValid(int arr[][]){

    }
}
