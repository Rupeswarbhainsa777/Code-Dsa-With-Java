package Code_75;

public class HighestAltitude {
    public static void main(String[] args) {

        int arr[] = {-5,1,5,0,-7};

        System.out.println(largestAltitude(arr));

    }
    public static int largestAltitude(int[] gain) {

        int alt=0;
        int max=0;
        for(int x : gain){
            max=max+x;


            alt = Math.max(alt,max);
        }
        return alt;

    }
}
