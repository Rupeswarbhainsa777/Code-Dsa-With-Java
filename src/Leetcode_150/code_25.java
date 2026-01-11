package Leetcode_150;

public class code_25 {

    public static void main(String[] args) {

        String st = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(st));

    }
    public static boolean palindrome(String str){


        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }if(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                return  false;
            }
            left++;
            right--;

        }
        return true;




























//        String st = str.toLowerCase();
//
//        StringBuilder t = new StringBuilder();
//
//        // Remove non-alphabet characters
//        for (int i = 0; i < st.length(); i++) {
//            char ch = st.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                t.append(ch);
//            }
//        }
//
//        String tm = t.toString();
//        String xt = "";
//        for(int i=tm.length()-1;i>=0;i--){
//            char ch = tm.charAt(i);
//            xt= xt+ ch;
//        }
//
//        if(xt.equals(tm)){
//            return true;
//        }
//        return false;

    }

}
