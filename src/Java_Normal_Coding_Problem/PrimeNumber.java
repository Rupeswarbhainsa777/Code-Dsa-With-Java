package Java_Normal_Coding_Problem;

public class PrimeNumber {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]+" ");
            }
        }

    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
