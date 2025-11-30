package Java_Normal_Coding_Problem;

public class FindX {
    public static void main(String[] args) {
        int x=1;
        int arr[] = {1,2,3,3,4};
        System.out.println(findTheelemrt(arr,x));
    }
    public static int findTheelemrt(int arr[],int x){
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                t=arr[i];
            }
        }
        return  t;
    }
}
