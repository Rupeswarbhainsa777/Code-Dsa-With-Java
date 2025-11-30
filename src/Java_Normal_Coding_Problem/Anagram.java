package Java_Normal_Coding_Problem;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(isAngaram(s1,s2));

    }
    public static boolean isAngaram(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        char ch1 [] = s1.toCharArray();
        char ch2 [] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1,ch2);
    }
}
