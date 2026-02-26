package JavaDaily;

public class RevANumber {
    public static void main(String[] args) {

        System.out.println(revNumber(12345));
    }
    public static int revNumber(int num){
        int rev =0;
        int dig =0;
        while(num!=0){
            dig=num%10;
            System.out.println(dig);
           rev=(rev*10)+dig;
            System.out.println(rev);

         num=   num/10;
            System.out.println(num);
        }
        return rev;
    }
}
