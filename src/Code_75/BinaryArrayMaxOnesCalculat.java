package Code_75;

public class BinaryArrayMaxOnesCalculat {
    public static void main(String[] args) {
        int arr[] ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;

        System.out.println(retunrWindo(arr,k));
    }
    public static  int retunrWindo(int arr [],int k){
        int ans =0;

        int i=0;
        int j=-1;

        int count =0;
        while(i<arr.length){

            if(arr[i]==0){
                count++;
                i++;
            }
            else {
                i++;
            }

            while(count>k){
                j++;

                if(arr[j]==0){
                    count--;
                }


            }

            int win = i-1-j;

            ans = Math.max(ans,win);

        }



        return  ans;
    }
}
