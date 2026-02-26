package JavaDaily;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        longestPalindrome(s);
    }

    public static void longestPalindrome(String s) {

        int n = s.length();
        int max = 0;

        for (int i = 1; i <= n; i++) {           // length of substring
            for (int j = 0; j <= n - i; j++) {   // starting index

                String sub = s.substring(j, j + i);

                if (isPalindrome(sub)) {
                    max = Math.max(max, sub.length());
                }
            }
        }

        System.out.println(max);
    }


    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
