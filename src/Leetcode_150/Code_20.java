package Leetcode_150;

public class Code_20 {

    public static void main(String[] args) {

        String s = "";


    }
    public static String rev(String st){
        String t="";
        for(int i=st.length()-1;i>=0;i--){
            char ch = st.charAt(i);
            t=t+ch;
        }
        return t;
    }
}
