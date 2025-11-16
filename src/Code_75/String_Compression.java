package Code_75;

public class String_Compression {
    public static void main(String[] args) {


        String_Compression compressor = new String_Compression();

        char[] testInput1 = {'a','a','b','b','c','c','c'};
        assert compressor.compress(testInput1) == 6 && new String(testInput1, 0, 6).equals("a2b2c3") : "Test case 1 failed";

        char[] testInput2 = {'a'};
        assert compressor.compress(testInput2) == 1 && new String(testInput2, 0, 1).equals("a") : "Test case 2 failed";

        char[] testInput3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assert compressor.compress(testInput3) == 4 && new String(testInput3, 0, 4).equals("ab12") : "Test case 3 failed";

        System.out.println("All test cases passed!");

    }
    public int compress(char arr[]){

        int n= arr.length;
        int idx=0;
        for(int i=0;i<n;i++){

            int count =0;
            char ch = arr[i];

            while (i<n && arr[i]==ch){
                count++;
                idx++;
            }

            if(count==1){
                arr[idx++]=ch;
            }
            else {
                arr[idx++]=ch;

                String st = String.valueOf(count);
                for(char cm : st.toCharArray()){
                    arr[idx++]=cm;
                }

            }
            i--;




        }
        return idx;
    }
}
