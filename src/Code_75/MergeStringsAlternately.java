package Code_75;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Merge characters alternately
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters
        if (i < word1.length()) {
            merged.append(word1.substring(i));
        }
        if (j < word2.length()) {
            merged.append(word2.substring(j));
        }

        return merged.toString();
    }

    // Quick test
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));   // Output: apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));   // Output: apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));   // Output: apbqcd
    }
}
