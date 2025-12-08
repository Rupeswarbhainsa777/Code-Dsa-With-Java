package Java_Normal_Coding_Problem;

import java.util.Scanner;

public class ContainsMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "javavac";
        String s2 = "vac";

        System.out.println(contains(s1, s2));
    }

    public static boolean contains(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int i = 0;
        int j = 0;

        while (i < ch1.length) {
            if (ch1[i] == ch2[j]) {
                i++;
                j++;

                if (j == ch2.length) {
                    return true; // Found substring
                }
                System.out.println(i);
            } else {

                i = i - j + 1; // Reset i to the next starting position
                j = 0;         // Reset comparison pointer
            }
        }

        return false;
    }
}
