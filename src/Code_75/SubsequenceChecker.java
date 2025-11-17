package Code_75;

public class SubsequenceChecker {
    public static void main(String[] args) {

        SubsequenceChecker checker = new SubsequenceChecker();

        assert checker.isSubsequence("abc", "ahbgdc") : "Test case 1 failed";
        assert !checker.isSubsequence("axc", "ahbgdc") : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }

    private boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;

        int i=0;
        int j=0;

        while (i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}
