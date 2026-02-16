package Sliding_window;

import java.util.HashSet;

public class No_1 {
    public static void main(String[] args) {

    }
    public static int longestSubstringWithoutRep(String str){

        int st=0;
        int end=0;
        int n = str.length();
        int maxWind=Integer.MAX_VALUE;
        HashSet<Character>  set1 = new HashSet<>();
        while (end<n){

            char ch = str.charAt(end);

            if(set1.contains(ch)){
                  while (st<end && set1.contains(ch)){
                      set1.remove(str.charAt(st));
                      st++;
                  }
            }
            set1.add(ch);
            maxWind = Math.max(maxWind,end-st);
            end++;

        }
        return (maxWind==Integer.MAX_VALUE)?0:maxWind;

    }
}
