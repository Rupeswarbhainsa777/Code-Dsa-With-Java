package JavaDaily;

public class RevCharArray {
    public static void main(String[] args) {

        char ch[] = {'a','b','c'};
        rev(ch);
        System.out.println(ch);
    }
    public static void rev(char [] c){
         int st =0;
         int end = c.length-1;
         while (st<end){
             char temp = c[st];
             c[st]=c[end];
             c[end]=temp;

             st++;
             end--;
         }
    }
}
