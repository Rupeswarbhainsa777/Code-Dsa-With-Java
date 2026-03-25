package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals(rev(str))){
            System.out.println("Palindrome");
        }
        else {
            System.out.print("Not A Palindrome");
        }
    }
    public static String rev(String str){
        String t="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            t=t+ch;
        }
        return t;
    }
}
