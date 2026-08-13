package DsaSeries.Arrays;

import java.util.Arrays;

public class ExcludeMinMax {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 5, 4};

             exclude(arr);
    }

    public static void exclude(int arr[]) {
        Arrays.sort(arr);

//        Arrays.equals({},{});
;
        int leng = arr.length-2;
        double val = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            val = val + arr[i];
        }
        System.out.println(val+" "+leng);
        System.out.println(val/leng);
    }
}
