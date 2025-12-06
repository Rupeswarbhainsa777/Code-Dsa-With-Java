package Java_Normal_Coding_Problem;

public class LongestPalindromSubString {
    public static void main(String[] args) {

        String st ="jaja";

        if(rev(st).equals(st)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }

    public static String rev(String str){

        String t="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            t=t+ch;
        }
        return  t;
    }
}
