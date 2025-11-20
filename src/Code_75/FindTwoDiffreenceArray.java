package Code_75;
import java.util.*;

public class FindTwoDiffreenceArray {
    public static void main(String[] args) {

        int arr1[]={1,2,3};
        int arr2[]={2,4,6};
        System.out.println(findDifference(arr1,arr2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int s1 : nums1){
            set1.add(s1);
        }
        for(int s2 : nums2){
            set2.add(s2);
        }

        HashSet<Integer> ans1=new HashSet<>();

        for(int x : nums1){
            if(!set2.contains(x)){
                ans1.add(x);
            }
        }



        HashSet<Integer> ans2=new HashSet<>();

        for(int x2 : nums2){
            if(!set1.contains(x2)){
                ans2.add(x2);
            }
        }

        return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));

    }
}
