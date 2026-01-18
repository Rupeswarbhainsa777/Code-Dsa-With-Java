package Leetcode_150;

public class Code_26 {
    public static void main(String[] args) {

    }
    public static boolean isSubsequence(String s, String t){

       if(s.isEmpty()){
           return false;
       }

       int i=0;
       int j=0;
       while (i < s.length() && j < t.length()){
           if(s.charAt(i) == t.charAt(j)){
               i++;
               j++;
           }
           else {
               j++;
           }
           if(i==s.length()) {
               return true;
           }

       }
       return false;
    }
}
