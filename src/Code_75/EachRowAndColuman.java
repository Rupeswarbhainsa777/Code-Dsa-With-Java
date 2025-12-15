//package Code_75;
//
//import java.util.*;
//
//class EachRowAndColuman {
//    public int equalPairs(int[][] grid) {
//
//        int n= grid.length;
//        Map<String,Integer> rowMap =new HashMap<>();
//        Map<String,Integer> columMap =new HashMap<>();
//
//        for(int [] row:grid){
//            StringBuilder sb=new StringBuilder();
//            for(int i : row){
//                sb.append(i).append("#");
//            }
//            rowMap.put(sb.toString(),rowMap.getOrDefault(sb.toString(),0)+1);
//        }
//        for(int i=0;i<n;i++){
//            StringBuilder sb =new StringBuilder();
//            for(int j=0;j<n;j++){
//                sb.append(grid[j][i]).append("#");
//            }
//            columMap.put(sb.toString(),columMap.getOrDefault(sb.toString(),0)+1);
//        }
//        int ans=0;
//        for(Map.Entry<String,Integer> set:rowMap.entrySet()){
//            String rhash=set.getKey();
//            if(columMap.containsKey(rhash)){
//                ans+=columMap.get(rhash)*rowMap.get(rhash);
//            }
//        }
//        return ans;
//    }
//}