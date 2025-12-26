//package Leetcode_150;
//
//public class Code_6 {
//    public static void main(String[] args) {
//
//    }
//    public int maxProfit(int[] prices) {
//        int len= prices.length;
//        int buy=prices[0];
//        int max=0;
//        for(int i=1;i<len;i++){
//            int curr= prices[i]-buy;
//            if(curr>max){
//                max=curr;
//            }
//            if(prices[i]<buy){
//                buy =prices[i];
//            }
//        }
//        return max;
//    }
//}
