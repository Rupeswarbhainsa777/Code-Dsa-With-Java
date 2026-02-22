package JavaDaily;

public class FindSingleElement {
    public static void main(String[] args) {


        int arr[] = new int[]{1,1,2,3,3,4,4};
        System.out.println(findElement(arr));
    }
    public static int findElement(int arr[]){
        int value =0;
        for(int i=0;i<arr.length;i++){
            value= value^arr[i];
        }
        return value;
    }
}
