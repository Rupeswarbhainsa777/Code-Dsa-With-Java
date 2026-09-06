package DsaSeries.Arrays;

public class SumOfSubarrays {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        sum(arr);

    }

    public static void sum(int arr[]) {

        int n = arr.length;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {

                    sum += arr[k];
                }
                System.out.println(sum);
            }

        }

    }


}
