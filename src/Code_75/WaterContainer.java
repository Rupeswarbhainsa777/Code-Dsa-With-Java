package Code_75;

public class WaterContainer {
    public static void main(String[] args) {

        WaterContainer container = new WaterContainer();

        assert container.maxArea(new int[]{1,8,6,2,5,4,8,3,7}) == 49 : "Test case 1 failed";
        assert container.maxArea(new int[]{1,1}) == 1 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }

    public int maxArea(int[] arr){

        int lp=0;
        int rp=arr.length-1;
        int maxwater=0;

        while (lp<rp){

            int width =lp-rp;
            int hight = Math.min(arr[lp],arr[rp]);

           int currentwater = width*hight;

           maxwater=Math.max(currentwater,maxwater);

           if(arr[lp]<arr[rp]){
               lp++;
            }
           else{
               rp--;
            }


        }
        return maxwater;
    }
}
