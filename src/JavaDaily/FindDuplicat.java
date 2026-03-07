package JavaDaily;

import java.util.HashMap;
import java.util.Map;

class FindDup {
    public static void main(String[] args) {

    }
    public  static  int findDuplicate(int[] nums) {
        int res =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                res = entry.getKey();
                break;
            }
        }



        return res;
    }
}
