//package Java_Normal_Coding_Problem;
//
//public class RevesePrefix {
//    public static void main(String[] args) {
//
//    }
//    public String reversePrefix(String word, char ch) {
//
//
//
//        StringBuilder  res=new StringBuilder();
//
//        for(int i=0;i<word.length();i++){
//
//            char c=word.charAt(i);
//            res.insert(0,c);
//            if(c==ch){
//                res.append(word.substring(i+1,word.length()));
//                return res.toString();
//
//            }
//        }
//        return word;
//
//    }
//}
