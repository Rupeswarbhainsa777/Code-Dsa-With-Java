
package Code_75;
import java.util.*;
public class UniiqueNumber {
    public static void main(String[] args) {

        int arr[] = {1,2,3,};

        System.out.println(uniqueOccurrences(arr));

    }
    public static  boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int ar :arr){

            freq.put(ar,freq.getOrDefault(ar,0)+1);
        }
        HashSet<Integer> set1=new HashSet<>();

        for(int fre : freq.values()){

            if(set1.contains(fre)){
                return false;
            }
            else{
                set1.add(fre);
            }


        }
        return true;
    }
}
