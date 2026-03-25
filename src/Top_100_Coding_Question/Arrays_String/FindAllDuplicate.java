package Top_100_Coding_Question.Arrays_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,3,3,2,2};

        printDuplicate(arr);
    }
    public static void printDuplicate(int arr[]){
        Map<Integer,Integer> map = new  HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> ent : map.entrySet()){
            if(ent.getValue()>1){
                System.out.print(ent.getKey()+" ");
            }
        }
    }
}
