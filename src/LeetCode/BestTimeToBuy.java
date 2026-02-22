package LeetCode;

public class BestTimeToBuy {
    public static void main(String[] args) {

    }
    public static int findMaxProfit(int arr[]){
        int n = arr.length;
        int buy = arr[0];
        int max =0;
        for(int i=1;i<arr.length;i++){
            int profit = arr[i]-buy;
            if(profit>max){
                max=profit;
            }
            if(arr[i]<buy){
                buy = arr[i];
            }
        }
        return max;
    }
}
