package Java_Normal_Coding_Problem;

public class SumOfSquareRoot {
    public static void main(String[] args) {

        int num=5;

        System.out.println(isTrue(num));
    }
    public static boolean isTrue(int num){
        long a =0;
        long b=(long)Math.sqrt(num);
        while(a<=b){
            long t= a * a + b*b;
            if(t==num){
                return true;
            } else if (t<num) {
                a++;

            }
            else {
                b--;
            }
        }
        return false;
    }
}
