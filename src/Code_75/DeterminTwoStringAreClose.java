package Code_75;

import java.util.Arrays;

public class DeterminTwoStringAreClose {
    public static void main(String[] args) {

       DeterminTwoStringAreClose checker = new DeterminTwoStringAreClose();

        assert checker.areStringsClose("abc", "bca") : "Test case 1 failed";
        assert !checker.areStringsClose("a", "aa") : "Test case 2 failed";
        assert checker.areStringsClose("cabbba", "abbccc") : "Test case 3 failed";

        System.out.println("All test cases passed!");

    }
    public boolean areStringsClose(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int ch1[] = new int[26];
        int ch2[] = new int[26];

        for(int i=0;i<word1.length();i++){
            ch1[word1.charAt(i)-'a']++;
            ch2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ch1[i]>0 && !(ch2[i]>0)){
                return false;
            }
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }
}
