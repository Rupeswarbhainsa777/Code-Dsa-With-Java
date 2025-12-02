package Java_Normal_Coding_Problem;

public class SetMatch {
    public static void main(String[] args) {

        int arr[] ={1,1,2,3,3,3,45,6,};
        isMatch(arr);

    }
    public static void isMatch(int arr[]){
        int n = arr.length;
        int[] count = new int[n + 1];
        int duplicate = -1;
        int missing = -1;

        // Count occurrences
        for (int num : arr) {
            count[num]++;
        }
        for(int x : count){
            System.out.println(x);
        }
    }
}
