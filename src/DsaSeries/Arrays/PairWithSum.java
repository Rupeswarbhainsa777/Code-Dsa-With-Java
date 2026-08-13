package DsaSeries.Arrays;

import java.util.Arrays;

public class PairWithSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int t = 9;

        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == arr[j]) {
                System.out.println("Yes");
            } else if (arr[j] < t) {
                j--;
            } else {
                i++;
            }


        }


    }
}
