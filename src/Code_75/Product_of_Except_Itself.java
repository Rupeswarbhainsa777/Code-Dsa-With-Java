package Code_75;

public class Product_of_Except_Itself {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4};

         int newA[] = productofit(arr);
        for(int i=0;i<newA.length;i++) {
            System.out.print(newA[i]+" ");
        }



    }
    public static  int[] productofit(int arr[]){

        int lenth = arr.length;
        int nums[] = new int[lenth];

        int productR =1;
        int productL =1;
        for(int i=lenth-1;i>=0;i--){
            nums[i]=productR;
            productR=productR*arr[i];
        }
        for(int i=0;i<lenth;i++){
            nums[i]=nums[i]*productL;
            productL=productL*arr[i];
        }

        return nums;




    }

}
