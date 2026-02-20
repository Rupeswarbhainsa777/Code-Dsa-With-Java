package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SubStringWithoutRep {
    public static void main(String[] args) {

    }
    public static int getLength()











































    public static int substringwithoutrep(String s){
        int n = s.length();
        int max =0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                String t="";

                for (int k=j;k<i+j;k++){
                   t=t+s.charAt(k);
                   if(isUnique(t)){
                       Math.max(max,t.length());
                   }
                }
//                System.out.println(t);
            }
        }
        return max;
    }
 public static boolean isUnique(String s){
     HashMap<Character,Integer> map = new HashMap<>();
     for(char ch : s.toCharArray()){
         map.put(ch,map.getOrDefault(ch,0)+1);
     }
     for(Map.Entry<Character,Integer> ent : map.entrySet()){
         if(ent.getKey()>1){
             return false;
         }
     }
     return true;

 }


















    public static void print(String s){
        int n = s.length();
        int k=4;

        for(int m=1;m<=n;m++) {
            for (int j = 0; j <= n - m; j++) {
                String t = "";
                for (int i = j; i < m + j; i++) {
                    t = t + s.charAt(i);
                }
                System.out.println(t);
            }
        }

    }
}
