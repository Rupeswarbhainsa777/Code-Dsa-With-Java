package Java_Normal_Coding_Problem;

public class RevesesString {
    public static void main(String[] args) {
        String t= "Java";
        String c="";
        for(int i=t.length()-1;i>=0;i--){

            char ch = t.charAt(i);
            c=c+ch;
        }
        System.out.println(c);
    }
}
