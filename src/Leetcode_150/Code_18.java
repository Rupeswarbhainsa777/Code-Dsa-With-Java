package Leetcode_150;

public class Code_18 {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(last(s));
    }
    public static int last(String str){
        String st[] = str.split(" ");

      int x=  st[st.length-1].length();
      return x;
    }
}
