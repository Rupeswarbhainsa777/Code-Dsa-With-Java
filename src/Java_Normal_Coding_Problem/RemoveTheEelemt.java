package Java_Normal_Coding_Problem;

public class RemoveTheEelemt {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2,3,3,84,80};
        int n=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=n){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
