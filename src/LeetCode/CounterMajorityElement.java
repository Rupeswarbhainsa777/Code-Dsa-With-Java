//package LeetCode;
//
//public class CounterMajorityElement {
//
//    public long countMajoritySubarrays(int[] nums, int target) {
//        int n=nums.length;
//        int s=n+1;
//        int [] b=new int[2*n+5];
//        long count =0;
//        int csum=0;
//        upgrade(b,s,1);
//        for(int number:nums){
//            csum+=(number==target)?1:-1;
//            count+=solution(b,csum+s-1);
//            upgrade(b,csum+s,1);
//        }
//
//        return count;
//
//
//
//
//
//    }
//    private void upgrade(int [] arr,int id,int value){
//        while(id<arr.length){
//            arr[id]+=value;
//            id+=id&(-id);
//        }
//    }
//    private int solution(int[] arr,int idx){
//        int sum =0;
//        while(idx>0){
//            sum+=arr[idx];
//            idx-=idx&(-idx);
//        }
//        return sum;
//    }
//}