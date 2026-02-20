//package Sliding_window;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class No_3_MinWindow {
//    public static void main(String[] args) {
//
//    }
//    public String minWindow(String s, String t) {
//        Map<Character,Integer> map = new HashMap<>();
//        for(char ch : t.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        int uniqueCharCount = map.size();
//        int startIdx =1;
//        int st =0;
//        int end =0;
//        int minLen = Integer.MAX_VALUE;
//        int n = s.length();
//        while(end<n){
//            char ch = s.charAt(end);
//            if(map.containsKey(ch)){
//                map.put(ch,map.get(ch)-1);
//                if(map.get(ch)==0){
//                    uniqueCharCount--;
//                }
//            }
//
//            while (uniqueCharCount==0){
//                int len =end-st+1;
//                if(len<minLen){
//                    minLen=len;
//                    startIdx=st;
//                }
//                ch = s.charAt(st);
//            }
//        }
//    }
//}
