package Java_Normal_Coding_Problem;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reves(256));

    }

    public static int reves(int nums){
        long rev=0;

        while (nums!=0){
            int dig = nums%10;
            rev = rev*10+dig;
            nums /=10;
        }

        return (int)rev;
    }
}
