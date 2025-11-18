package Code_75;

public class MaxVowelSubstringCalculato {

    public static void main(String[] args) {

        String st = "abciiidef";
        int k=3;
        System.out.println(maxVowels(st,k));
    }

    public static int maxVowels(String s, int k) {


        int count =0;
        int ans=0;
        for(int i=0;i<k;i++){

            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }

        ans =count;

        for(int i=k;i<s.length();i++){

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-k);
            if(isVowel(ch1)){
                count++;
            }
            if(isVowel(ch2)){
                count--;
            }
            ans =Math.max(ans,count);


        }

        return ans;



    }









    public static boolean isVowel(char ch){

        if(
                ch=='a'||
                        ch=='e'||
                        ch=='i'||
                        ch=='o'||
                        ch=='u'||
                        ch=='A'||
                        ch=='E'||
                        ch=='I'||
                        ch=='O'||
                        ch=='U'

        )
        {
            return true;
        }
        return false;



    }
}
