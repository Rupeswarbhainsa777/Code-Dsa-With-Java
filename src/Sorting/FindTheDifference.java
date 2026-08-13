package Sorting;

import java.util.Arrays;

public class FindTheDifference {
    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {

        char ch = 0;

        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] != arr2[j]) {
                ch = arr2[j];
                break;
            }
            i++;
            j++;


        }
        if (ch == 0) {
            ch = arr2[arr2.length - 1];
        }


        return ch;

    }
}
